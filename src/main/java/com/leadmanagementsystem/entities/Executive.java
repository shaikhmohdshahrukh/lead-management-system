package com.leadmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;


@Entity
public class Executive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "executive_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long executiveId;
	
	private String executiveName;

	private Long userId;
	
	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(Long executiveId, String executiveName) {
		super();
		this.executiveId = executiveId;
		this.executiveName = executiveName;
	}

	public Executive(Long executiveId, String executiveName, Long userId) {
		super();
		this.executiveId = executiveId;
		this.executiveName = executiveName;
		this.userId = userId;
	}

	public Long getExecutiveId() {
		return executiveId;
	}

	public void setExecutiveId(Long executiveId) {
		this.executiveId = executiveId;
	}

	public String getExecutiveName() {
		return executiveName;
	}

	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ExecutiveDao [executiveId=" + executiveId + ", executiveName=" + executiveName + ", userId=" + userId
				+ "]";
	}

	
	
	
}
