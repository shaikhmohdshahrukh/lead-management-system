package com.leadmanagementsystem.entities;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Prospect {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "prospect_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")

	private Long prospectId;

	private Date dateTime;

	private String status;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "source_id", referencedColumnName = "sourceId")
	private Source source;

	@ManyToOne
	@JoinColumn(name = "lead_id", referencedColumnName = "leadId")
	private Lead lead;

	@ManyToOne
	@JoinColumn(name = "business_id", referencedColumnName = "businessId")
	private Business business;

	public Prospect() {
		super();
	}

	public Prospect(Long prospectId, Date dateTime, String status) {
		super();
		this.prospectId = prospectId;
		this.dateTime = dateTime;
		this.status = status;
	}

	public Prospect(Long prospectId, Date dateTime, String status, Long userId, Product product, Source source,
			Lead lead, Business business) {
		super();
		this.prospectId = prospectId;
		this.dateTime = dateTime;
		this.status = status;
		this.userId = userId;
		this.product = product;
		this.source = source;
		this.lead = lead;
		this.business = business;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "Prospect [prospectId=" + prospectId + ", dateTime=" + dateTime + ", status=" + status + ", userId="
				+ userId + ", product=" + product + ", source=" + source + ", lead=" + lead + ", business=" + business
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(business, dateTime, lead, product, prospectId, source, status, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prospect other = (Prospect) obj;
		return Objects.equals(business, other.business) && Objects.equals(dateTime, other.dateTime)
				&& Objects.equals(lead, other.lead) && Objects.equals(product, other.product)
				&& Objects.equals(prospectId, other.prospectId) && Objects.equals(source, other.source)
				&& Objects.equals(status, other.status) && Objects.equals(userId, other.userId);
	}

}
