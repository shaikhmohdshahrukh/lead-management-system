package com.leadmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "response_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long responseId;

	private String responseName;

	private String responseType;

	private Long userId;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(Long responseId, String responseName, String responseType) {
		super();
		this.responseId = responseId;
		this.responseName = responseName;
		this.responseType = responseType;
	}

	public Response(Long responseId, String responseName, String responseType, Long userId) {
		super();
		this.responseId = responseId;
		this.responseName = responseName;
		this.responseType = responseType;
		this.userId = userId;
	}

	public Long getResponseId() {
		return responseId;
	}

	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}

	public String getResponseName() {
		return responseName;
	}

	public void setResponseName(String responseName) {
		this.responseName = responseName;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", responseName=" + responseName + ", responseType="
				+ responseType + ", userId=" + userId + "]";
	}

}
