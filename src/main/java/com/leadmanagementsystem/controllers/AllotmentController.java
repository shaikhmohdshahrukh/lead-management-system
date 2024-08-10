package com.leadmanagementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leadmanagementsystem.entities.Allotment;
import com.leadmanagementsystem.services.AllotmentService;
import com.leadmanagementsystem.services.LeadService;

@RestController
public class AllotmentController {

	@Autowired
	private AllotmentService allotmentService;

	@Autowired
	private LeadService leadService;


	@PostMapping("/allotments")
	public Allotment saveAllAllotment(@RequestBody Allotment allotment) {
		allotmentService.createAllotment(allotment);
		return allotment;
	}

	
	@GetMapping("/allotment/{Id}")
	public Allotment findAllotmentById(@PathVariable("Id") Long aId) {
		return allotmentService.findAllotmentById(aId);
	}

	@GetMapping("/allotments")
	public List<Allotment> findAllAllotments() {
		return allotmentService.findAllAllotments();
	}

	@DeleteMapping("/allotments/{Id}")
	public void deleteAllotmentById(@PathVariable("Id") Long aId) {
		allotmentService.deleteAllotment(aId);
	}

	@PutMapping("/allotments")
	public void updateAllotment(@RequestBody Allotment allotment) {
		allotmentService.updateAllotment(allotment);
		
	}
}

