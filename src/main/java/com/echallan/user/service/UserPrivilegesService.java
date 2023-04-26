package com.echallan.user.service;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;

public interface UserPrivilegesService {

	public UserResponseDto addPrivilege(UserRequestDto userRequestDto);

	public UserResponseDto getPrivilegeList();

	public UserResponseDto deletePrivilege(UserRequestDto userRequestDto);

	public UserResponseDto updatePrivilege(UserRequestDto userRequestDto);

	public UserResponseDto getPrivilegeById(Long id);


}
