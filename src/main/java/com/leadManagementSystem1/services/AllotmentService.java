package com.leadManagementSystem1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadManagementSystem1.daos.AllotmentDao;
import com.leadManagementSystem1.entities.Allotment;

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
