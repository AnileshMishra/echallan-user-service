package com.echallan.user.dto;

import java.util.List;

import com.echallan.user.model.AreaCircle;
import com.echallan.user.model.District;
import com.echallan.user.model.EchMstRoles;
import com.echallan.user.model.Privilege;
import com.echallan.user.model.State;
import com.echallan.user.model.UserType;

public class UserResponseDto {

	private String status;
	private Integer statusCode;
	private String statusMsg;
	private String stateCode;
	private String districtCode;
	private Privilege privilege;
	private List<Privilege> privilegeList;
	
	private EchMstRoles Role;
	private List<EchMstRoles> roleList;
	
	private List<UserType> userTypeList;
	private List<State> stateList;
	private List<District> districtList;
	private List<AreaCircle> areaCircleList;
	
	
	public List<AreaCircle> getAreaCircleList() {
		return areaCircleList;
	}
	public void setAreaCircleList(List<AreaCircle> areaCircleList) {
		this.areaCircleList = areaCircleList;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}
	public List<State> getStateList() {
		return stateList;
	}
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	public List<UserType> getUserTypeList() {
		return userTypeList;
	}
	public void setUserTypeList(List<UserType> userTypeList) {
		this.userTypeList = userTypeList;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public List<Privilege> getPrivilegeList() {
		return privilegeList;
	}
	public void setPrivilegeList(List<Privilege> privilegeList) {
		this.privilegeList = privilegeList;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	
	public EchMstRoles getRole() {
		return Role;
	}
	public void setRole(EchMstRoles role) {
		Role = role;
	}
	public List<EchMstRoles> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<EchMstRoles> roleList) {
		this.roleList = roleList;
	}
	
	
	
	
	
}
