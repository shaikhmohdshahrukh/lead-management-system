package com.leadmanagementsystem.dtos;

import com.leadmanagementsystem.entities.Product;

public class ProductDto {

	private Long productId;

	private String productName;

	private String productDetails;

	private Long businessId;

	private Long userId;

	public ProductDto() {
		super();

	}

	public ProductDto(long productId, String productName, String productDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
	}

	public ProductDto(long productId, String productName, String productDetails, Long businessId, Long userId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.businessId = businessId;
		this.userId = userId;
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

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Product getProduct() {
		return new Product(productId, productName, productDetails, userId, null);
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productDetails="
				+ productDetails + ", businessId=" + businessId + ", userId=" + userId + "]";
	}

}
