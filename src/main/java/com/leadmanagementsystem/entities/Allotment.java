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
public class Allotment {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "allotment_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long allotmentId;
	
	private Date allotmentDate;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "lead_id", referencedColumnName = "leadId")
	private Lead lead;

	public Allotment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Allotment(Long allotmentId, Date allotmentDate, Lead lead) {
		super();
		this.allotmentId = allotmentId;
		this.allotmentDate = allotmentDate;
		this.lead = lead;
	}

	public Allotment(Long allotmentId, Date allotmentDate, Long userId, Lead lead) {
		super();
		this.allotmentId = allotmentId;
		this.allotmentDate = allotmentDate;
		this.userId = userId;
		this.lead = lead;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	@Override
	public String toString() {
		return "Allotment [allotmentId=" + allotmentId + ", allotmentDate=" + allotmentDate + ", userId=" + userId
				+ ", lead=" + lead + "]";
	}
	
}