package com.leadmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "`right`")
public class Right {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "right_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long rightId;

	private Long userId; 

	@ManyToOne
	@JoinColumn(name = "userType_id", referencedColumnName = "userTypeId")
	private UserType userType;
	

	@ManyToOne
	@JoinColumn(name = "page_id", referencedColumnName = "pageId")
	private Page page;
	
	
	
	public Right() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Right(Long rightId) {
		super();
		this.rightId = rightId;
	}

	public Right(Long rightId, Long userId, UserType userType, Page page) {
		super();
		this.rightId = rightId;
		this.userId = userId;
		this.userType = userType;
		this.page = page;
	}

	public Long getRightId() {
		return rightId;
	}

	public void setRightId(Long rightId) {
		this.rightId = rightId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Right [rightId=" + rightId + ", userId=" + userId + ", userType=" + userType + ", page=" + page + "]";
	}
	

}
