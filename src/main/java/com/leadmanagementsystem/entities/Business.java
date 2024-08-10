package com.leadmanagementsystem.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Business {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "business_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long businessId;

	private String businessName;

	private String businessDetails;

	private Long userId;

	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Business(Long businessId, String businessName, String businessDetails) {
		super();
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessDetails = businessDetails;
	}

	public Business(Long businessId, String businessName, String businessDetails, Long userId) {
		super();
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessDetails = businessDetails;
		this.userId = userId;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessDetails() {
		return businessDetails;
	}

	public void setBusinessDetails(String businessDetails) {
		this.businessDetails = businessDetails;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Business [businessId=" + businessId + ", businessName=" + businessName + ", businessDetails="
				+ businessDetails + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(businessDetails, businessId, businessName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Business other = (Business) obj;
		return Objects.equals(businessDetails, other.businessDetails) && Objects.equals(businessId, other.businessId)
				&& Objects.equals(businessName, other.businessName) && Objects.equals(userId, other.userId);
	}

}
