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
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "sales_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long salesId;
	
	private Date salesDateTime;
	
	private String salesAmount;
	
	private Long userId;
	
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;
	

	@ManyToOne
	@JoinColumn(name = "executive_id", referencedColumnName = "executiveId")
	private Executive executive;


	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sales(Long salesId, Date salesDateTime, String salesAmount) {
		super();
		this.salesId = salesId;
		this.salesDateTime = salesDateTime;
		this.salesAmount = salesAmount;
		}


	public Sales(Long salesId, Date salesDateTime, String salesAmount, Long userId, Product product,
			Executive executive) {
		super();
		this.salesId = salesId;
		this.salesDateTime = salesDateTime;
		this.salesAmount = salesAmount;
		this.userId = userId;
		this.product = product;
		this.executive = executive;
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


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Executive getExecutive() {
		return executive;
	}


	public void setExecutive(Executive executive) {
		this.executive = executive;
	}


	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", salesDateTime=" + salesDateTime + ", salesAmount=" + salesAmount
				+ ", userId=" + userId + ", product=" + product + ", executive=" + executive + "]";
	}
	
	
}