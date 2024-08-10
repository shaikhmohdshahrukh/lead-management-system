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

import com.leadmanagementsystem.entities.Response;
import com.leadmanagementsystem.services.ResponseService;

@RestController
public class ResponseController {

	@Autowired
	protected ResponseService responseService;

	@GetMapping("/responses")
	public List<Response> findAllResponses() {
		return responseService.findAllResponses();
	}

	@GetMapping("/responses/{responseId}")
	public ResponseEntity<?> findByResponseId(@PathVariable Long responseId) {
		Optional<Response> optionalCategory = responseService.findResponseById(responseId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<Response>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Response Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/responses/{responseId}")
	public ResponseEntity<?> deleteByResponseId(@PathVariable Long responseId) {
		responseService.deleteResponse(responseId);
		return new ResponseEntity<String>("Response Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/responses/")
	public ResponseEntity<?> createResponse(@RequestBody Response response) {
		Long id = responseService.createResponse(response);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/responses/{responseId}")
	public ResponseEntity<?> updateResponse(@RequestBody Response response) {
		response = responseService.updateResponse(response);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
