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

import com.leadmanagementsystem.dtos.MyUserDto;
import com.leadmanagementsystem.entities.Business;
import com.leadmanagementsystem.entities.MyUser;
import com.leadmanagementsystem.services.BusinessService;
import com.leadmanagementsystem.services.MyUserService;

//@CrossOrigin("http://localhost:4200/") 
@RestController
public class MyUserController {

	@Autowired
	private MyUserService myUserService;

	@Autowired
	private BusinessService businessService;

	@GetMapping("/myusers")
	public List<MyUser> findAllMyUsers() {
		return myUserService.findAllMyUsers();
	}

	@GetMapping("/myusers/{myUserId}")
	public ResponseEntity<?> findByMyUserId(@PathVariable Long myUserId) {
		Optional<MyUser> optionalCategory = myUserService.findMyUserById(myUserId);
		if (optionalCategory.isPresent())
			return new ResponseEntity<MyUser>(optionalCategory.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("MyUser Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/myusers/{myUserId}")
	public ResponseEntity<?> deleteByMyUserId(@PathVariable Long myUserId) {
		myUserService.deleteMyUser(myUserId);
		return new ResponseEntity<String>("MyUser Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/myusers")
	public ResponseEntity<?> createMyUser(@RequestBody MyUserDto myUserDto) {
		MyUser myUser = myUserDto.getMyUser();
		Optional<Business> business = businessService.findBusinessById(myUserDto.getBusinessId());
		myUser.setBusiness(business.get());
		myUserService.createMyUser(myUser);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/myusers/{myUserId}")
	public ResponseEntity<?> updateMyUser(@RequestBody MyUserDto myUserDto) {
		MyUser myUser = myUserDto.getMyUser();
		Optional<Business> business = businessService.findBusinessById(myUserDto.getBusinessId());
		myUser.setBusiness(business.get());
		myUser = myUserService.updateMyUser(myUser);
		return new ResponseEntity<MyUser>(myUser, HttpStatus.OK);
	}

}
