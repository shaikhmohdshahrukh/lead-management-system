package com.leadmanagementsystem.dtos;

import java.util.Date;

import com.leadmanagementsystem.entities.Calls;

public class CallsDto {

	private Long callsId;
	
	private Date callsDate;
	
	private String callsDetails;

	private String userId;
	
	private Long productId;
	
	private Long responseId;
	
	
	public CallsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CallsDto(Long callsId, Date callsDate, String callsDetails) {
		super();
		this.callsId = callsId;
		this.callsDate = callsDate;
		this.callsDetails = callsDetails;
	}

	public CallsDto(Long callsId, Date callsDate, String callsDetails, String userId, Long productId, Long responseId) {
		super();
		this.callsId = callsId;
		this.callsDate = callsDate;
		this.callsDetails = callsDetails;
		this.userId = userId;
		this.productId = productId;
		this.responseId = responseId;
	}

	public Long getCallsId() {
		return callsId;
	}

	public void setCallsId(Long callsId) {
		this.callsId = callsId;
	}

	public Date getCallsDate() {
		return callsDate;
	}

	public void setCallsDate(Date callsDate) {
		this.callsDate = callsDate;
	}

	public String getCallsDetails() {
		return callsDetails;
	}

	public void setCallsDetails(String callsDetails) {
		this.callsDetails = callsDetails;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getResponseId() {
		return responseId;
	}

	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}
	public Calls getCalls() {
		return new Calls(callsId, callsDate, callsDetails, userId, null, null);
	}
	
	@Override
	public String toString() {
		return "CallsDto [callsId=" + callsId + ", callsDate=" + callsDate + ", callsDetails=" + callsDetails
				+ ", userId=" + userId + ", productId=" + productId + ", responseId=" + responseId + "]";
	}
	
	
	
}

