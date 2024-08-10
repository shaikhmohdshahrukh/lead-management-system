package com.leadmanagementsystem.dtos;

import java.util.Date;
import com.leadmanagementsystem.entities.Sales;

public class SalesDto {

	private Long salesId;
	
	private Date salesDateTime;
	
	private String salesAmount;
	
	private Long userId;
	
	private Long productId;
	
	private Long executiveId;
	


	public SalesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesDto(Long salesId, Date salesDateTime, String salesAmount) {
		super();
		this.salesId = salesId;
		this.salesDateTime = salesDateTime;
		this.salesAmount = salesAmount;
	}

	public SalesDto(Long salesId, Date salesDateTime, String salesAmount, Long userId, Long productId,
			Long executiveId) {
		super();
		this.salesId = salesId;
		this.salesDateTime = salesDateTime;
		this.salesAmount = salesAmount;
		this.userId = userId;
		this.productId = productId;
		this.executiveId = executiveId;
	}

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public Date getSalesDateTime() {
		return salesDateTime;
	}

	public void setSalesDateTime(Date salesDateTime) {
		this.salesDateTime = salesDateTime;
	}

	public String getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getExecutiveId() {
		return executiveId;
	}

	public void setExecutiveId(Long executiveId) {
		this.executiveId = executiveId;
	}
	
	public Sales getSales() {
		return new Sales(salesId, salesDateTime, salesAmount, userId, null, null);
	}

	@Override
	public String toString() {
		return "SalesDto [salesId=" + salesId + ", salesDateTime=" + salesDateTime + ", salesAmount=" + salesAmount
				+ ", userId=" + userId + ", productId=" + productId + ", executiveId=" + executiveId + "]";
	}
	
	
	
}
