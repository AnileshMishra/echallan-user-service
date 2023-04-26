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
import com.echallan.user.service.UserRoleService;

@RestController
@RequestMapping("/users/role")
public class RoleController {

	@Autowired 
	private UserRoleService roleService;
	
	@RequestMapping(value="/getRoleList", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getRoleList() {
		
		UserResponseDto responseDto = roleService.getRoleList();
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/getRoleById/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserResponseDto> getRoleById(@PathVariable Long id) {
		
		UserResponseDto responseDto = roleService.getRoleById(id);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> addNewRole(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = roleService.addRole(userRequestDto);
//		if (responseDto.getStatusCode() != UserConstraints.OK_200) {
//			return ResponseEntity.
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> deleteRole(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = roleService.deleteRole(userRequestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ResponseEntity<UserResponseDto> updatePrivilege(@RequestBody UserRequestDto userRequestDto) {
		
		UserResponseDto responseDto = roleService.updateRole(userRequestDto);
//		if (responseDto == null) {
//			throw new ResourceNotFoundException("No user found with this userId = " + userRequestDto.getUserId() );
//		}
		return ResponseEntity.ok(responseDto);
	}

}
