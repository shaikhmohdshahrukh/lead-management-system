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
import com.leadmanagementsystem.entities.Lead;
import com.leadmanagementsystem.services.LeadService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class LeadController {

	@Autowired
	private LeadService leadService;

	@GetMapping("/leads")
	public List<Lead> findAllLeads() {
		return leadService.findAllLeads();
	}

	@GetMapping("/users/{userId}/leads")
	public List<Lead> findAllLeadByUserId(@PathVariable Long userId) {
		return leadService.findAllLeads(userId);
	}

	@GetMapping("/leads/{leadId}")
	public ResponseEntity<?> findByLeadId(@PathVariable Long leadId) {
		Optional<Lead> optionalCategory = leadService.findLeadById(leadId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<Lead>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Lead Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/leads/{leadId}")
	public ResponseEntity<?> deleteByLeadId(@PathVariable Long leadId) {
		leadService.deleteLead(leadId);
		return new ResponseEntity<String>("Lead Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/leads")
	public ResponseEntity<?> createLeads(@RequestBody Lead lead) {
		Long id = leadService.createLeads(lead);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/leads/{leadId}")
	public ResponseEntity<?> updateLeads(@RequestBody Lead lead) {
		lead = leadService.updateLead(lead);
		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}
}
