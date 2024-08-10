package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.ProductDao;
import com.leadmanagementsystem.entities.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productRepository;

	public Long createProduct(Product product) {
		product = productRepository.save(product);
		return product.getProductId();
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
	}

	public Optional<Product> findProductById(Long productId) {
		return productRepository.findById(productId);
	}

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

}
