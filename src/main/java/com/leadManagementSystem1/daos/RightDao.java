package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadManagementSystem1.entities.Right;

public interface RightDao extends JpaRepository<Right, Long> {

	List<Right> findAllByUserId(Long userId);

}
