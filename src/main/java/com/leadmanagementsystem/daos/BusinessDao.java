package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Business;

@Repository
public interface BusinessDao extends JpaRepository<Business, Long> {
	public List<Business> findAllByUserId(Long userId);

}
