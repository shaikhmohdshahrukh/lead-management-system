package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadManagementSystem1.entities.Lead;

 
public interface LeadDao extends JpaRepository<Lead, Long> {
	public List<Lead> findAllByUserId(Long userId);
	//public List<Lead> findAllByGenderAndLocation(String gender, String location);
}
