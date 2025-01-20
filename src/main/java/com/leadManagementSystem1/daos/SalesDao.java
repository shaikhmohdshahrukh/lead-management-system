package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadManagementSystem1.entities.Sales;

public interface SalesDao extends JpaRepository<Sales, Long>{

	List<Sales> findAllByUserId(Long userId);

}
