package com.echallan.user.service;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;

public interface UserRoleService {

	public UserResponseDto getRoleList();

	public UserResponseDto addRole(UserRequestDto userRequestDto);

	public UserResponseDto deleteRole(UserRequestDto userRequestDto);

	public UserResponseDto updateRole(UserRequestDto userRequestDto);

	public UserResponseDto getRoleById(Long id);

}
