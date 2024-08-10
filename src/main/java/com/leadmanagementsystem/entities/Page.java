package com.leadmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Page {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "page_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long pageId;
	
	private String pageName;
	
	private String pageFile;
	
	private String pageDetails;
	
	private String pagePriority;
	
	private Long userId;

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(Long pageId, String pageName, String pageFile, String pageDetails, String pagePriority) {
		super();
		this.pageId = pageId;
		this.pageName = pageName;
		this.pageFile = pageFile;
		this.pageDetails = pageDetails;
		this.pagePriority = pagePriority;
	}

	public Page(Long pageId, String pageName, String pageFile, String pageDetails, String pagePriority, Long userId) {
		super();
		this.pageId = pageId;
		this.pageName = pageName;
		this.pageFile = pageFile;
		this.pageDetails = pageDetails;
		this.pagePriority = pagePriority;
		this.userId = userId;
	}

	public Long getPageId() {
		return pageId;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageFile() {
		return pageFile;
	}

	public void setPageFile(String pageFile) {
		this.pageFile = pageFile;
	}

	public String getPageDetails() {
		return pageDetails;
	}

	public void setPageDetails(String pageDetails) {
		this.pageDetails = pageDetails;
	}

	public String getPagePriority() {
		return pagePriority;
	}

	public void setPagePriority(String pagePriority) {
		this.pagePriority = pagePriority;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Page [pageId=" + pageId + ", pageName=" + pageName + ", pageFile=" + pageFile + ", pageDetails="
				+ pageDetails + ", pagePriority=" + pagePriority + ", userId=" + userId + "]";
	}
	
	
	
}
