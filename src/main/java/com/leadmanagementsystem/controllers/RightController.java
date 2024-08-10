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
import com.leadmanagementsystem.entities.Right;
import com.leadmanagementsystem.services.RightService;

@RestController
public class RightController {

	@Autowired
	protected RightService rightService;

	@GetMapping("/rights")
	public List<Right> findAllRight() {
		return rightService.findAllRight();
	}

	@GetMapping("/users/{userId}/rights")
	public List<Right> findAllRightByUserId(@PathVariable Long userId) {
		return rightService.findAllRight(userId);
	}

	@GetMapping("/rights/{rightId}")
	public ResponseEntity<?> findByRightId(@PathVariable Long rightId) {
		Optional<Right> optionalRight = rightService.findRightById(rightId);
		if (optionalRight.isPresent())
			return new ResponseEntity<Right>(optionalRight.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Right Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/rights/{rightId}")
	public ResponseEntity<?> deleteByRightId(@PathVariable Long rightId) {
		rightService.deleteRight(rightId);
		return new ResponseEntity<String>("Right Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/rights")
	public ResponseEntity<?> createRight(@RequestBody Right right) {
		Long id = rightService.createRight(right);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/rights/{rightId}")
	public ResponseEntity<?> updateRight(@RequestBody Right right) {
		right = rightService.updateRight(right);
		return new ResponseEntity<Right>(right, HttpStatus.OK);
	}
}
