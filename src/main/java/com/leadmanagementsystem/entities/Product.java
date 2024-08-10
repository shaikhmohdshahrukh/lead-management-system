package com.leadmanagementsystem.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "product_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long productId;

	private String productName;

	private String productDetails;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "business_id", referencedColumnName = "businessId")
	private Business business;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, String productName, String productDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
	}

	public Product(long productId, String productName, String productDetails, Long userId, Business business) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.userId = userId;
		this.business = business;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDetails=" + productDetails
				+ ", userId=" + userId + ", business=" + business + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(business, productDetails, productId, productName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(business, other.business) && Objects.equals(productDetails, other.productDetails)
				&& productId == other.productId && Objects.equals(productName, other.productName)
				&& Objects.equals(userId, other.userId);
	}

}
