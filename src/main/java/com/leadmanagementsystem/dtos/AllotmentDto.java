package com.leadmanagementsystem.dtos;

import java.util.Date;

public class AllotmentDto {

	private Long allotmentId;
	
	private Date allotmentDate;

	private Long leadId;
	
	private Long userId;

	public AllotmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AllotmentDto(Long allotmentId, Date allotmentDate, Long leadId) {
		super();
		this.allotmentId = allotmentId;
		this.allotmentDate = allotmentDate;
		this.leadId = leadId;
	}



	public AllotmentDto(Long allotmentId, Date allotmentDate, Long leadId, Long userId) {
		super();
		this.allotmentId = allotmentId;
		this.allotmentDate = allotmentDate;
		this.leadId = leadId;
		this.userId = userId;
	}



	public Long getAllotmentId() {
		return allotmentId;
	}



	public void setAllotmentId(Long allotmentId) {
		this.allotmentId = allotmentId;
	}



	public Date getAllotmentDate() {
		return allotmentDate;
	}



	public void setAllotmentDate(Date allotmentDate) {
		this.allotmentDate = allotmentDate;
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



	@Override
	public String toString() {
		return "AllotmentDto [allotmentId=" + allotmentId + ", allotmentDate=" + allotmentDate + ", leadId=" + leadId
				+ ", userId=" + userId + "]";
	}
	
	
	
}
