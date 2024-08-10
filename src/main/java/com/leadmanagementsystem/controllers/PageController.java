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
import com.leadmanagementsystem.entities.Page;
import com.leadmanagementsystem.services.PageService;

@RestController
public class PageController {

	@Autowired
	private PageService pageService;

	@GetMapping("/pages")
	public List<Page> findAllPage() {
		return pageService.findAllPage();
	}

	@GetMapping("/users/{userId}/pages")
	public List<Page> findAllPageByUserId(@PathVariable Long userId) {
		return pageService.findAllPage(userId);
	}

	@GetMapping("/pages/{pageId}")
	public ResponseEntity<?> findByPagesId(@PathVariable Long pagesId) {
		Optional<Page> optionalPage = pageService.findPageById(pagesId);
		if (optionalPage.isPresent())
			return new ResponseEntity<Page>(optionalPage.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Page Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/pages/{pageId}")
	public ResponseEntity<?> deleteByPageId(@PathVariable Long pageId) {
		pageService.deletePage(pageId);
		return new ResponseEntity<String>("Page Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/pages")
	public ResponseEntity<?> createPage(@RequestBody Page page) {
		Long id = pageService.createPage(page);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/pages/{pageId}")
	public ResponseEntity<?> updatePage(@RequestBody Page page) {
		page = pageService.updatePage(page);
		return new ResponseEntity<Page>(page, HttpStatus.OK);
	}
}
