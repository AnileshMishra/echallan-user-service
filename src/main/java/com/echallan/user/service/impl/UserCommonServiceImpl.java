package com.echallan.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echallan.user.dto.UserResponseDto;
import com.echallan.user.model.AreaCircle;
import com.echallan.user.model.District;
import com.echallan.user.model.State;
import com.echallan.user.model.UserType;
import com.echallan.user.repository.AreaCircleRepository;
import com.echallan.user.repository.DistrictRepository;
import com.echallan.user.repository.StateRepository;
import com.echallan.user.repository.UserTypeRepository;
import com.echallan.user.service.UserCommonService;
import com.echallan.user.utils.UserConstraints;

@Service
public class UserCommonServiceImpl implements UserCommonService {

	@Autowired
	private UserTypeRepository userTypeRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired 
	private DistrictRepository districtRepository;
	
	@Autowired
	private AreaCircleRepository areaCircleRepository;

	@Override
	public UserResponseDto getUserTypeList() {
		UserResponseDto responseDto = new UserResponseDto();

		List<UserType> userTypesList = userTypeRepository.findAll();
		if (userTypesList != null && !userTypesList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setUserTypeList(userTypesList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.NOT_FOUND_RECORD_MSG);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto getStateList() {
		UserResponseDto responseDto = new UserResponseDto();

		List<State> stateList = stateRepository.findAll();
		if (stateList != null && !stateList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStateList(stateList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.NOT_FOUND_RECORD_MSG);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto getDistrictRTOList(UserResponseDto requestDto) {
		UserResponseDto responseDto = new UserResponseDto();

		List<District> districtList = districtRepository.findAllByStateCodeAndIsActive(requestDto.getStateCode(), UserConstraints.IS_ACTIVE);
		
		if (districtList != null && !districtList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setDistrictList(districtList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.NOT_FOUND_RECORD_MSG);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto getCircleARTOList(UserResponseDto requestDto) {
		UserResponseDto responseDto = new UserResponseDto();

		List<AreaCircle> areaCircleList = areaCircleRepository.findAllByStateCodeAndDistrictCodeAndIsActive(requestDto.getStateCode(),requestDto.getDistrictCode(), UserConstraints.IS_ACTIVE);
		
		if (areaCircleList != null && !areaCircleList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setAreaCircleList(areaCircleList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.NOT_FOUND_RECORD_MSG);
			return responseDto;
		}
	}

}
