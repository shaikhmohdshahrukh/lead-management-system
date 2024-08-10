package com.leadmanagementsystem.dtos;

import java.util.Date;

import com.leadmanagementsystem.entities.Prospect;

public class ProspectDto {

	private Long prospectId;

	private Date dateTime;

	private String status;

	private Long businessId;

	private Long productId;

	private Long sourceId;

	private Long leadId;

	private Long userId;

	public ProspectDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProspectDto(Long prospectId, Date dateTime, String status, Long businessId, Long productId, Long sourceId,
			Long leadId) {
		super();
		this.prospectId = prospectId;
		this.dateTime = dateTime;
		this.status = status;
		this.businessId = businessId;
		this.productId = productId;
		this.sourceId = sourceId;
		this.leadId = leadId;
	}

	public ProspectDto(Long prospectId, Date dateTime, String status, Long businessId, Long productId, Long sourceId,
			Long leadId, Long userId) {
		super();
		this.prospectId = prospectId;
		this.dateTime = dateTime;
		this.status = status;
		this.businessId = businessId;
		this.productId = productId;
		this.sourceId = sourceId;
		this.leadId = leadId;
		this.userId = userId;
	}

	public Long getProspectId() {
		return prospectId;
	}

	public void setProspectId(Long prospectId) {
		this.prospectId = prospectId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Long getSourceId() {
		return sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Prospect getProspect() {
		return new Prospect(prospectId, dateTime, status, userId, null, null, null, null);
	}

	@Override
	public String toString() {
		return "ProspectDTO [prospectId=" + prospectId + ", dateTime=" + dateTime + ", status=" + status
				+ ", businessId=" + businessId + ", productId=" + productId + ", sourceId=" + sourceId + ", leadId="
				+ leadId + ", userId=" + userId + "]";
	}
}
