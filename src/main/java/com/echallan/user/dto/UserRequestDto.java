package com.echallan.user.dto;

import com.echallan.user.model.EchMstRoles;
import com.echallan.user.model.Privilege;

public class UserRequestDto {

	private Integer userId;
	private Privilege privilege;
	private EchMstRoles roles;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public EchMstRoles getRoles() {
		return roles;
	}

	public void setRoles(EchMstRoles roles) {
		this.roles = roles;
	}
	
	
	
	
}
