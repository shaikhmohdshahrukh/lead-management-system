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
import com.leadmanagementsystem.entities.Business;
import com.leadmanagementsystem.services.BusinessService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class BusinessController {

	@Autowired
	protected BusinessService businessService;

	@GetMapping("/businesss")
	public List<Business> findAllBusinesss() {
		return businessService.findAllBusinesss();
	}

	@GetMapping("/users/{userId}/businesss")
	public List<Business> findAllBusinessByUserId(@PathVariable Long userId) {
		return businessService.findAllBusinesss(userId);
	}

	@GetMapping("/businesss/{businessId}")
	public ResponseEntity<?> findByBusinessId(@PathVariable Long businessId) {
		Optional<Business> optionalBusiness = businessService.findBusinessById(businessId);
		if (optionalBusiness.isPresent())
			return new ResponseEntity<Business>(optionalBusiness.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Business Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/businesss/{businessId}")
	public ResponseEntity<?> deleteByBusinessId(@PathVariable Long businessId) {
		businessService.deleteBusiness(businessId);
		return new ResponseEntity<String>("Business Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/businesss")
	public ResponseEntity<?> createBusiness(@RequestBody Business business) {
		Long id = businessService.createBusiness(business);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/businesss/{businessId}")
	public ResponseEntity<?> updateBusiness(@RequestBody Business business) {
		business = businessService.updateBusiness(business);
		return new ResponseEntity<Business>(business, HttpStatus.OK);
	}
}
