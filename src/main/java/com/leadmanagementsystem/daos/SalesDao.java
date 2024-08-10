package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadmanagementsystem.entities.Sales;

public interface SalesDao extends JpaRepository<Sales, Long>{

	List<Sales> findAllByUserId(Long userId);

}
