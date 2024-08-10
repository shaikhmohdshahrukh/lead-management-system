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

import com.leadmanagementsystem.dtos.ProspectDto;
import com.leadmanagementsystem.entities.Business;
import com.leadmanagementsystem.entities.Prospect;
import com.leadmanagementsystem.services.BusinessService;
import com.leadmanagementsystem.services.ProspectService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class ProspectController {

	@Autowired
	private ProspectService prospectService;

	@Autowired
	private BusinessService businessService;

	@GetMapping("/prospects")
	public List<Prospect> findAllProspects() {
		return prospectService.findAllProspects();
	}

	@GetMapping("/prospects/{prospectId}")
	public ResponseEntity<?> findByProspectId(@PathVariable Long prospectId) {
		Optional<Prospect> optionalCategory = prospectService.findProspectById(prospectId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<Prospect>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Prospect Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/prospects/{prospectId}")
	public ResponseEntity<?> deleteByProspectId(@PathVariable Long prospectId) {
		prospectService.deleteProspect(prospectId);
		return new ResponseEntity<String>("Prospect Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/prospects")
	public ResponseEntity<?> createProspect(@RequestBody ProspectDto prospectDto) {
		Prospect prospect = prospectDto.getProspect();
		Optional<Business> business = businessService.findBusinessById(prospectDto.getBusinessId());
		prospect.setBusiness(business.get());
		prospectService.createProspect(prospect);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/prospects/{prospectId}")
	public ResponseEntity<?> updateProspect(@RequestBody ProspectDto prospectDTO) {
		Prospect prospect = prospectDTO.getProspect();
		Optional<Business> business = businessService.findBusinessById(prospectDTO.getBusinessId());
		prospect.setBusiness(business.get());
		prospect = prospectService.updateProspect(prospect);
		return new ResponseEntity<Prospect>(prospect, HttpStatus.OK);
	}
}
