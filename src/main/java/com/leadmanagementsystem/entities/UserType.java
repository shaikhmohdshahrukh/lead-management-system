package com.leadmanagementsystem.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class UserType {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "user_type_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long userTypeId;

	private String userType;

	private Long userId;

	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserType(long userTypeId, String userType) {
		super();
		this.userTypeId = userTypeId;
		this.userType = userType;
	}

	public UserType(Long userTypeId, String userType, Long userId) {
		super();
		this.userTypeId = userTypeId;
		this.userType = userType;
		this.userId = userId;
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserType [userTypeId=" + userTypeId + ", userType=" + userType + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, userType, userTypeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserType other = (UserType) obj;
		return Objects.equals(userId, other.userId) && Objects.equals(userType, other.userType)
				&& Objects.equals(userTypeId, other.userTypeId);
	}

}
