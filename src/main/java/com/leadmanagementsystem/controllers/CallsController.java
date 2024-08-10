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
import com.leadmanagementsystem.entities.Calls;
import com.leadmanagementsystem.services.CallsService;

@RestController
public class CallsController {
	@Autowired
	protected CallsService callsService;

	@GetMapping("/calls")
	public List<Calls> findAllCalls() {
		return callsService.findAllCalls();
	}

//	@GetMapping("/users/{userId}/calls")
//	public List<Calls> findAllCallsByUserId(@PathVariable Long userId) {
//		return callsService.findAllCalls(userId);
//	}

	@GetMapping("/calls/{callsId}")
	public ResponseEntity<?> findByCallsId(@PathVariable Long callsId) {
		Optional<Calls> optionalCalls = callsService.findCallsById(callsId);
		if (optionalCalls.isPresent())
			return new ResponseEntity<Calls>(optionalCalls.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Calls Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/calls/{callsId}")
	public ResponseEntity<?> deleteByCallsId(@PathVariable Long callsId) {
		callsService.deleteCalls(callsId);
		return new ResponseEntity<String>("Calls Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/calls")
	public ResponseEntity<?> createCalls(@RequestBody Calls calls) {
		Long id = callsService.createCalls(calls);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/calls/{callsId}")
	public ResponseEntity<?> updateCalls(@RequestBody Calls calls) {
		calls = callsService.updateCalls(calls);
		return new ResponseEntity<Calls>(calls, HttpStatus.OK);
	}
}
