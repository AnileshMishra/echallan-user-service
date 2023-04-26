package com.echallan.user.model;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_users")
public class EchUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;

    @NotNull
    @Size(max = 100)
    private String username;

    @NotNull
    @Size(max = 100)
    private String password;

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 200)
    @Column(name = "employee_id")
    private String employeeId;

    @NotNull
    @Size(max = 100)
    @Column(name = "email_id")
    private String emailId;

    @NotNull
    @Column(name = "mobile_no")
    private int mobileNo;

    @Column(name = "designation_id")
    private int designationId;

    @NotNull
    @Column(name = "role_id")
    private int roleId;

    @Size(max = 70)
    @Column(name = "user_type")
    private String userType;

    @Size(max = 20)
    @Column(name = "branch_type")
    private String branchType;

    @NotNull
    @Column(name = "is_active")
    private int isActive;

    @NotNull
    @Column(name = "is_suspended")
    private int isSuspended;

    @Size(max = 2)
    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "district_code")
    private int districtCode;

    @Column(name = "circle_id")
    private int circleId;

    @NotNull
    @Column(name = "court_id")
    private int courtId;

    @NotNull
    @Column(name = "dept_code")
    private int deptCode;

    @NotNull
    @Column(name = "office_code")
    private int officeCode;

    @NotNull
    @Column(name = "device_id")
    private int deviceId;

    @NotNull
    @Size(max = 255)
    @Column(name = "device_token")
    private String deviceToken;

    @Size(max = 50)
    private String imei;

    @NotNull
    @Size(max = 255)
    @Column(name = "device_name")
    private String deviceName;

    @NotNull
    @Column(name = "is_cctv")
    private int isCctv;

    @NotNull
    @Column(name = "is_mparivahan")
    private int isMparivahan;

    @NotNull
    @Column(name = "is_ngo")
    private int isNgo;

    @NotNull
    @Column(name = "notify_me")
    private int notifyMe;

    @Size(max = 20)
    @Column(name = "latitue")
    private String latitude;

    @Size(max = 20)
    @Column(name = "longitude")
    private String longitude;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(int isSuspended) {
		this.isSuspended = isSuspended;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public int getCircleId() {
		return circleId;
	}

	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}

	public int getCourtId() {
		return courtId;
	}

	public void setCourtId(int courtId) {
		this.courtId = courtId;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public int getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getIsCctv() {
		return isCctv;
	}

	public void setIsCctv(int isCctv) {
		this.isCctv = isCctv;
	}

	public int getIsMparivahan() {
		return isMparivahan;
	}

	public void setIsMparivahan(int isMparivahan) {
		this.isMparivahan = isMparivahan;
	}

	public int getIsNgo() {
		return isNgo;
	}

	public void setIsNgo(int isNgo) {
		this.isNgo = isNgo;
	}

	public int getNotifyMe() {
		return notifyMe;
	}

	public void setNotifyMe(int notifyMe) {
		this.notifyMe = notifyMe;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
    
    

}
