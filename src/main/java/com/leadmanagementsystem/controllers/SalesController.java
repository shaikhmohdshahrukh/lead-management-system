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
import com.leadmanagementsystem.entities.Sales;
import com.leadmanagementsystem.services.SalesService;

@RestController
public class SalesController {

	@Autowired
	protected SalesService salesService;

	@GetMapping("/sales")
	public List<Sales> findAllSales() {
		return salesService.findAllSales();
	}

	@GetMapping("/users/{userId}/sales")
	public List<Sales> findAllSalesByUserId(@PathVariable Long userId) {
		return salesService.findAllSales(userId);
	}

	@GetMapping("/sales/{salesId}")
	public ResponseEntity<?> findBySalesId(@PathVariable Long salesId) {
		Optional<Sales> optionalSales = salesService.findSalesById(salesId);
		if (optionalSales.isPresent())
			return new ResponseEntity<Sales>(optionalSales.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Sales Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/sales/{salesId}")
	public ResponseEntity<?> deleteBySalesId(@PathVariable Long salesId) {
		salesService.deleteSales(salesId);
		return new ResponseEntity<String>("Sales Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/sales")
	public ResponseEntity<?> createSales(@RequestBody Sales sales) {
		Long id = salesService.createSales(sales);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/sales/{salesId}")
	public ResponseEntity<?> updateSales(@RequestBody Sales sales) {
		sales = salesService.updateSales(sales);
		return new ResponseEntity<Sales>(sales, HttpStatus.OK);
	}
}
