package com.leadmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "`lead`")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "lead_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long leadId;

	private String name;

	private String address;

	private String gender;

	private String location;

	private String city;

	private String state;

	private String country;

	private String emailId;

	private String pinCode;

	private String gstNo;

	private String mobileNo;

	private Long userId;

	public Lead() {
		super();
	}

	public Lead(Long leadId, String name, String address, String gender, String location, String city, String state,
			String country, String emailId, String pinCode, String gstNo, String mobileNo) {
		super();
		this.leadId = leadId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.location = location;
		this.city = city;
		this.state = state;
		this.country = country;
		this.emailId = emailId;
		this.pinCode = pinCode;
		this.gstNo = gstNo;
		this.mobileNo = mobileNo;
	}

	public Lead(Long leadId, String name, String address, String gender, String location, String city, String state,
			String country, String emailId, String pinCode, String gstNo, String mobileNo, Long userId) {
		super();
		this.leadId = leadId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.location = location;
		this.city = city;
		this.state = state;
		this.country = country;
		this.emailId = emailId;
		this.pinCode = pinCode;
		this.gstNo = gstNo;
		this.mobileNo = mobileNo;
		this.userId = userId;
	}

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Lead [leadId=" + leadId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", location=" + location + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", emailId=" + emailId + ", pinCode=" + pinCode + ", gstNo=" + gstNo + ", mobileNo=" + mobileNo
				+ ", userId=" + userId + "]";
	}

}
