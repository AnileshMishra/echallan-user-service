package com.echallan.user.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.model.EchUser;
import com.echallan.user.repository.EchUserRepository;
import com.echallan.user.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private EchUserRepository echUserRepository;
	
	@Override
	public EchUser getUserById(UserRequestDto userRequestDto) {
		EchUser userDetails = echUserRepository.findByUserId(userRequestDto.getUserId());
		return userDetails;
	}

}
