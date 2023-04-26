package com.echallan.user.service;

import java.util.Optional;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.model.EchUser;

public interface UserService {

	public EchUser getUserById(UserRequestDto userRequestDto);
}
