package com.leadmanagementsystem.dtos;

import java.util.Objects;

import com.leadmanagementsystem.entities.MyUser;

public class MyUserDto {

	private Long myUserId;

	private String myUserName;

	private String myUserAddress;

	private String myUserGender;

	private String myUserEmail;

	private String myUserMobileNo;

	private Long businessId;

	private Long productId;

	private Long userTypeId;

	private Long userId;

	public MyUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyUserDto(Long myUserId, String myUserName, String myUserAddress, String myUserGender, String myUserEmail,
			String myUserMobileNo, Long businessId, Long productId, Long userTypeId) {
		super();
		this.myUserId = myUserId;
		this.myUserName = myUserName;
		this.myUserAddress = myUserAddress;
		this.myUserGender = myUserGender;
		this.myUserEmail = myUserEmail;
		this.myUserMobileNo = myUserMobileNo;
		this.businessId = businessId;
		this.productId = productId;
		this.userTypeId = userTypeId;
	}

	public MyUserDto(Long myUserId, String myUserName, String myUserAddress, String myUserGender, String myUserEmail,
			String myUserMobileNo, Long businessId, Long productId, Long userTypeId, Long userId) {
		super();
		this.myUserId = myUserId;
		this.myUserName = myUserName;
		this.myUserAddress = myUserAddress;
		this.myUserGender = myUserGender;
		this.myUserEmail = myUserEmail;
		this.myUserMobileNo = myUserMobileNo;
		this.businessId = businessId;
		this.productId = productId;
		this.userTypeId = userTypeId;
		this.userId = userId;
	}

	public Long getMyUserId() {
		return myUserId;
	}

	public void setMyUserId(Long myUserId) {
		this.myUserId = myUserId;
	}

	public String getMyUserName() {
		return myUserName;
	}

	public void setMyUserName(String myUserName) {
		this.myUserName = myUserName;
	}

	public String getMyUserAddress() {
		return myUserAddress;
	}

	public void setMyUserAddress(String myUserAddress) {
		this.myUserAddress = myUserAddress;
	}

	public String getMyUserGender() {
		return myUserGender;
	}

	public void setMyUserGender(String myUserGender) {
		this.myUserGender = myUserGender;
	}

	public String getMyUserEmail() {
		return myUserEmail;
	}

	public void setMyUserEmail(String myUserEmail) {
		this.myUserEmail = myUserEmail;
	}

	public String getMyUserMobileNo() {
		return myUserMobileNo;
	}

	public void setMyUserMobileNo(String myUserMobileNo) {
		this.myUserMobileNo = myUserMobileNo;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public MyUser getMyUser() {
		return new MyUser(myUserId, myUserName, myUserAddress, myUserGender, myUserEmail, myUserMobileNo, userId, null,
				null, null);
	}

	@Override
	public String toString() {
		return "MyUserDTO [myUserId=" + myUserId + ", myUserName=" + myUserName + ", myUserAddress=" + myUserAddress
				+ ", myUserGender=" + myUserGender + ", myUserEmail=" + myUserEmail + ", myUserMobileNo="
				+ myUserMobileNo + ", businessId=" + businessId + ", productId=" + productId + ", userTypeId="
				+ userTypeId + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(businessId, myUserAddress, myUserEmail, myUserGender, myUserId, myUserMobileNo, myUserName,
				productId, userId, userTypeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyUserDto other = (MyUserDto) obj;
		return Objects.equals(businessId, other.businessId) && Objects.equals(myUserAddress, other.myUserAddress)
				&& Objects.equals(myUserEmail, other.myUserEmail) && Objects.equals(myUserGender, other.myUserGender)
				&& Objects.equals(myUserId, other.myUserId) && Objects.equals(myUserMobileNo, other.myUserMobileNo)
				&& Objects.equals(myUserName, other.myUserName) && Objects.equals(productId, other.productId)
				&& Objects.equals(userId, other.userId) && Objects.equals(userTypeId, other.userTypeId);
	}

}
