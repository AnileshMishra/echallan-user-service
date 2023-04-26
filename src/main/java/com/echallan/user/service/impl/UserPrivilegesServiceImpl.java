package com.echallan.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;
import com.echallan.user.model.EchMstRoles;
import com.echallan.user.model.Privilege;
import com.echallan.user.repository.PrivilegeRepository;
import com.echallan.user.service.UserPrivilegesService;
import com.echallan.user.utils.UserConstraints;

@Service
public class UserPrivilegesServiceImpl implements UserPrivilegesService{

	@Autowired
	private PrivilegeRepository privilegeRepository;
	
	
	@Override
	public UserResponseDto addPrivilege(UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = new UserResponseDto();
		
		Privilege privilege = privilegeRepository.save(userRequestDto.getPrivilege());
		if(privilege != null && privilege.getPrivilegeId() != null) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.SAVED_RECORD_MSG);
			responseDto.setPrivilege(privilege);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
		
	}


	@Override
	public UserResponseDto getPrivilegeList() {
		UserResponseDto responseDto = new UserResponseDto();
		
		List<Privilege> privilegeList = privilegeRepository.findByIsActive(UserConstraints.IS_ACTIVE);
		if(privilegeList !=null && !privilegeList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setPrivilegeList(privilegeList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}


	@Override
	public UserResponseDto deletePrivilege(UserRequestDto userRequestDto) {
		UserResponseDto responseDto = new UserResponseDto();
		
		if(userRequestDto.getPrivilege().getIsActive() != 0) {
			responseDto.setStatus(UserConstraints.BAD_REQUEST);
			responseDto.setStatusCode(UserConstraints.BAD_REQUEST_STATUS_CODE);
			return responseDto;
		} else {
			Privilege privilege = privilegeRepository.save(userRequestDto.getPrivilege());
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.DELETE_RECORD_MSG);
			responseDto.setPrivilege(privilege);
			return responseDto;
		}
	}


	@Override
	public UserResponseDto updatePrivilege(UserRequestDto userRequestDto) {
		UserResponseDto responseDto = new UserResponseDto();
		
		Privilege privilege = privilegeRepository.save(userRequestDto.getPrivilege());
		if(privilege != null && privilege.getPrivilegeId() != null) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.UPDATE_RECORD_MSG);
			responseDto.setPrivilege(privilege);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}


	@Override
	public UserResponseDto getPrivilegeById(Long id) {
		UserResponseDto responseDto = new UserResponseDto();

		Privilege privilege = privilegeRepository.findByPrivilegeId(id);
		if (privilege != null) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.FOUND_RECORD_MSG);
			responseDto.setPrivilege(privilege);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}

}
