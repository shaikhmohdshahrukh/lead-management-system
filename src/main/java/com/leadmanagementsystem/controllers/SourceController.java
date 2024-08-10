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

import com.leadmanagementsystem.entities.Source;
import com.leadmanagementsystem.services.SourceService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class SourceController {

	@Autowired
	protected SourceService sourceService;

	@GetMapping("/sources")
	public List<Source> findAllSources() {
		return sourceService.findAllSources();
	}

	@GetMapping("/users/{userId}/sources")
	public List<Source> findAllSourceByUserId(@PathVariable Long userId) {
		return sourceService.findAllSources(userId);
	}

	@GetMapping("/sources/{sourceId}")
	public ResponseEntity<?> findBySourceId(@PathVariable Long sourceId) {
		Optional<Source> optionalCategory = sourceService.findSourceById(sourceId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<Source>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Source Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/sources/{sourceId}")
	public ResponseEntity<?> deleteBySourceId(@PathVariable Long sourceId) {
		sourceService.deleteSourse(sourceId);
		return new ResponseEntity<String>("Source Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/sources")
	public ResponseEntity<?> createSource(@RequestBody Source source) {
		Long id = sourceService.createSource(source);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/sources/{sourceId}")
	public ResponseEntity<?> updateSource(@RequestBody Source source) {
		source = sourceService.updateSource(source);
		return new ResponseEntity<Source>(source, HttpStatus.OK);
	}
}
