package com.echallan.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.echallan.user.dto.UserRequestDto;
import com.echallan.user.dto.UserResponseDto;
import com.echallan.user.service.UserPrivilegesService;

@RestController
@RequestMapping("/users/privileges")
public class PrivilegesConroller {

	@Autowired 
	private UserPrivilegesService privilegesService;
	
	@RequestMapping(value="/getPrivilegeList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getPrivilegeList() {
		
		UserResponseDto responseDto = privilegesService.getPrivilegeList();
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/getPrivilegeById/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getPrivilegeById(@PathVariable Long id) {
		
		UserResponseDto responseDto = privilegesService.getPrivilegeById(id);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> addNewPrivilege(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = privilegesService.addPrivilege(userRequestDto);
//		if (responseDto.getStatusCode() != UserConstraints.OK_200) {
//			return ResponseEntity.
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> deletePrivilege(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = privilegesService.deletePrivilege(userRequestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> updatePrivilege(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = privilegesService.updatePrivilege(userRequestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
}
