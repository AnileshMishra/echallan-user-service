package com.echallan.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;
import com.echallan.user.model.EchUser;
import com.echallan.user.service.UserCommonService;
import com.echallan.user.service.UserDepartmentService;
import com.echallan.user.service.UserService;
import com.echallan.userl.exception.ResourceNotFoundException;

/**
 * @author Anilesh Mishra
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired 
	private UserService userService;

	@Autowired
	private UserDepartmentService departmentService;
	
	@Autowired
	private UserCommonService commonService;
	
	@RequestMapping(value="/getUserById", method = RequestMethod.GET)
	public ResponseEntity<EchUser> getuserById(@RequestBody UserRequestDto userRequestDto) {
		
		EchUser userDetails = userService.getUserById(userRequestDto);
		if (userDetails == null) {
			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
		}
		return ResponseEntity.ok(userDetails);
	}
	
	@RequestMapping(value="/createUser", method = RequestMethod.POST)
	public ResponseEntity<EchUser> createUser(@RequestBody UserRequestDto userRequestDto){
		
		EchUser userDetails = userService.getUserById(userRequestDto);
		if (userDetails == null) {
			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
		}
		return ResponseEntity.ok(userDetails);
	}
	
	
	@RequestMapping(value="/getDepartmentTypeList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getDepartmentTypeList() {
		
		UserResponseDto responseDto = departmentService.getDepartmentTypeList();
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/getUserTypeList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getUserTypeList() {
		
		UserResponseDto responseDto = commonService.getUserTypeList();
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}

	@RequestMapping(value="/getStateList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getStateList() {
		
		UserResponseDto responseDto = commonService.getStateList();
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/getDistrictRTOList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getDistrictRTOList(@RequestBody UserResponseDto requestDto) {
		
		UserResponseDto responseDto = commonService.getDistrictRTOList(requestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/getCircleARTOList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getCircleARTOList(@RequestBody UserResponseDto requestDto) {
		
		UserResponseDto responseDto = commonService.getCircleARTOList(requestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
}
