package com.echallan.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;
import com.echallan.user.model.EchMstRoles;
import com.echallan.user.repository.EchMstRolesRepository;
import com.echallan.user.service.UserRoleService;
import com.echallan.user.utils.UserConstraints;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private EchMstRolesRepository echMstRolesRepository;

	@Override
	public UserResponseDto addRole(UserRequestDto userRequestDto) {

		UserResponseDto responseDto = new UserResponseDto();

		EchMstRoles role = echMstRolesRepository.save(userRequestDto.getRoles());
		if (role != null && role.getRoleId() != null) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.SAVED_RECORD_MSG);
			responseDto.setRole(role);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}

	}

	@Override
	public UserResponseDto getRoleList() {
		UserResponseDto responseDto = new UserResponseDto();

		List<EchMstRoles> roleList = echMstRolesRepository.findByIsActive(UserConstraints.IS_ACTIVE);
		if (roleList != null && !roleList.isEmpty()) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.FOUND_RECORD_MSG);
			responseDto.setRoleList(roleList);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto deleteRole(UserRequestDto userRequestDto) {
		UserResponseDto responseDto = new UserResponseDto();

		if (userRequestDto.getPrivilege().getIsActive() != 0) {
			responseDto.setStatus(UserConstraints.BAD_REQUEST);
			responseDto.setStatusCode(UserConstraints.BAD_REQUEST_STATUS_CODE);
			return responseDto;
		} else {
			EchMstRoles role = echMstRolesRepository.save(userRequestDto.getRoles());
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.DELETE_RECORD_MSG);
			responseDto.setRole(role);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto updateRole(UserRequestDto userRequestDto) {
		UserResponseDto responseDto = new UserResponseDto();

		EchMstRoles role = echMstRolesRepository.save(userRequestDto.getRoles());
		if (role != null ) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.UPDATE_RECORD_MSG);
			responseDto.setRole(role);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}

	@Override
	public UserResponseDto getRoleById(Long id) {
		UserResponseDto responseDto = new UserResponseDto();

		EchMstRoles role = echMstRolesRepository.findByRoleId(id);
		if (role != null) {
			responseDto.setStatus(UserConstraints.STATUS_SUCCESS);
			responseDto.setStatusCode(UserConstraints.SUCCESS_STATUS_CODE);
			responseDto.setStatusMsg(UserConstraints.FOUND_RECORD_MSG);
			responseDto.setRole(role);
			return responseDto;
		} else {
			responseDto.setStatus(UserConstraints.STATUS_FAILED);
			responseDto.setStatusCode(UserConstraints.FAILED_STATUS_CODE);
			return responseDto;
		}
	}

}
