package com.leadmanagementsystem.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class MyUser {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "my_user_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long myUserId;

	private String myUserName;

	private String myUserAddress;

	private String myUserGender;

	private String myUserEmail;

	private String myUserMobileNo;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "business_id", referencedColumnName = "businessId")
	private Business business;

	@ManyToOne
	@JoinColumn(name = "userType_id", referencedColumnName = "userTypeId")
	private UserType userType;

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyUser(Long myUserId, String myUserName, String myUserAddress, String myUserGender, String myUserEmail,
			String myUserMobileNo, Product product, Business business, UserType userType) {
		super();
		this.myUserId = myUserId;
		this.myUserName = myUserName;
		this.myUserAddress = myUserAddress;
		this.myUserGender = myUserGender;
		this.myUserEmail = myUserEmail;
		this.myUserMobileNo = myUserMobileNo;
		this.product = product;
		this.business = business;
		this.userType = userType;
	}

	public MyUser(Long myUserId, String myUserName, String myUserAddress, String myUserGender, String myUserEmail,
			String myUserMobileNo, Long userId, Product product, Business business, UserType userType) {
		super();
		this.myUserId = myUserId;
		this.myUserName = myUserName;
		this.myUserAddress = myUserAddress;
		this.myUserGender = myUserGender;
		this.myUserEmail = myUserEmail;
		this.myUserMobileNo = myUserMobileNo;
		this.userId = userId;
		this.product = product;
		this.business = business;
		this.userType = userType;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "MyUser [myUserId=" + myUserId + ", myUserName=" + myUserName + ", myUserAddress=" + myUserAddress
				+ ", myUserGender=" + myUserGender + ", myUserEmail=" + myUserEmail + ", myUserMobileNo="
				+ myUserMobileNo + ", userId=" + userId + ", product=" + product + ", business=" + business
				+ ", userType=" + userType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(business, myUserAddress, myUserEmail, myUserGender, myUserId, myUserMobileNo, myUserName,
				product, userId, userType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyUser other = (MyUser) obj;
		return Objects.equals(business, other.business) && Objects.equals(myUserAddress, other.myUserAddress)
				&& Objects.equals(myUserEmail, other.myUserEmail) && Objects.equals(myUserGender, other.myUserGender)
				&& Objects.equals(myUserId, other.myUserId) && Objects.equals(myUserMobileNo, other.myUserMobileNo)
				&& Objects.equals(myUserName, other.myUserName) && Objects.equals(product, other.product)
				&& Objects.equals(userId, other.userId) && Objects.equals(userType, other.userType);
	}

}
