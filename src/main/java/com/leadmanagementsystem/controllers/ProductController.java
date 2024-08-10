package com.leadmanagementsystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leadmanagementsystem.dtos.ProductDto;
import com.leadmanagementsystem.entities.Business;
import com.leadmanagementsystem.entities.Product;
import com.leadmanagementsystem.services.BusinessService;
import com.leadmanagementsystem.services.ProductService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class ProductController {

	@Autowired
	protected ProductService productService;

	@Autowired
	protected BusinessService businessService;

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}

	@GetMapping("/products/{productId}")
	public ResponseEntity<?> findByProductId(@PathVariable Long productId) {
		Optional<Product> optionalCategory = productService.findProductById(productId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<Product>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Product Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/products/{productId}")
	public ResponseEntity<?> deleteByProductId(@PathVariable Long productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/products")
	public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto) {
		Product product = productDto.getProduct();
		Optional<Business> business = businessService.findBusinessById(productDto.getBusinessId());
		product.setBusiness(business.get());
		productService.createProduct(product);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/products/{productId}")
	public ResponseEntity<?> updateProduct(@RequestBody ProductDto productDto) {
		Product product = productDto.getProduct();
		Optional<Business> business = businessService.findBusinessById(productDto.getBusinessId());
		product.setBusiness(business.get());
		product = productService.updateProduct(product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}
