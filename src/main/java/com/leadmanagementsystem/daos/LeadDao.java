package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Lead;

 
//public interface LeadDao extends JpaRepository<Lead, Long> {
public interface LeadDao {
	public List<Lead> findAllByUserId(Long userId);
	public List<Lead> findAllByGenderAndLocation(String gender, String location);
}
