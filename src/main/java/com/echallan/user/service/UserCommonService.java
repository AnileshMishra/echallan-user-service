package com.echallan.user.service;

import com.echallan.user.dto.UserResponseDto;

public interface UserCommonService {

	public UserResponseDto getUserTypeList();

	public UserResponseDto getStateList();

	public UserResponseDto getDistrictRTOList(UserResponseDto requestDto);

	public UserResponseDto getCircleARTOList(UserResponseDto requestDto);

}
