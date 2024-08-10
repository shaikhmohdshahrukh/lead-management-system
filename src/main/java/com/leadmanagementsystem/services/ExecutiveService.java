package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.ExecutiveDao;
import com.leadmanagementsystem.entities.Executive;

@Service
public class ExecutiveService {

	@Autowired
	protected ExecutiveDao executiveRepository; 
	
	public void saveExecutive(Executive executive){		
		 executiveRepository.save(executive);
	}
	
	public void updateExecutive(Executive executive) {
		executiveRepository.save(executive);
	}

	public void deleteExecutive(Long exeId) {
		executiveRepository.deleteById(exeId);
	}

	public Executive findExecutiveById(Long exeId) {
		Optional<Executive> executive = executiveRepository.findById(exeId);
		return executive.get();
	}

	public List<Executive> findAllExecutive() {
		return executiveRepository.findAll();
	}
}
