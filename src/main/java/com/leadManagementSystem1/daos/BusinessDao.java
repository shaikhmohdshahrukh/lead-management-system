package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadManagementSystem1.entities.Business;

@Repository
public interface BusinessDao extends JpaRepository<Business, Long> {
	
	public List<Business> findAllByUserId(Long userId);

}
