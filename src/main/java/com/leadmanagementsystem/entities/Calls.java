package com.leadmanagementsystem.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Calls {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "calls_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long callsId;
	
	private Date callsDate;
	
	private String callsDetails;
	
	private String userId;
	

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;
	

	@ManyToOne
	@JoinColumn(name = "response_id", referencedColumnName = "responseId")
	private Response response;


	public Calls() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Calls(Long callsId, Date callsDate, String callsDetails, Product product, Response response) {
		super();
		this.callsId = callsId;
		this.callsDate = callsDate;
		this.callsDetails = callsDetails;
		this.product = product;
		this.response = response;
	}


	public Calls(Long callsId, Date callsDate, String callsDetails, String userId, Product product, Response response) {
		super();
		this.callsId = callsId;
		this.callsDate = callsDate;
		this.callsDetails = callsDetails;
		this.userId = userId;
		this.product = product;
		this.response = response;
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


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Response getResponse() {
		return response;
	}


	public void setResponse(Response response) {
		this.response = response;
	}


	@Override
	public String toString() {
		return "Calls [callsId=" + callsId + ", callsDate=" + callsDate + ", callsDetails=" + callsDetails + ", userId="
				+ userId + ", product=" + product + ", response=" + response + "]";
	}
	
	
}
