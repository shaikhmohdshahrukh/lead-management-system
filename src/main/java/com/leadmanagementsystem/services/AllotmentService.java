package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.AllotmentDao;
import com.leadmanagementsystem.entities.Allotment;

@Service
public class AllotmentService {

	@Autowired
	private AllotmentDao allotmentRepository;
	
	
	public void createAllotment(Allotment allotment) {
		allotmentRepository.save(allotment);
	}
	
	public List<Allotment> findAllAllotments() {
		return allotmentRepository.findAll();
	}

	public void updateAllotment(Allotment allotment) {
		allotmentRepository.save(allotment);
	}

	public void deleteAllotment(Long aId) {
		allotmentRepository.deleteById(aId);
	}

	public Allotment findAllotmentById(Long aId) {
		Optional<Allotment> allotment= allotmentRepository.findById(aId);
		return allotment.get();
	}

}
