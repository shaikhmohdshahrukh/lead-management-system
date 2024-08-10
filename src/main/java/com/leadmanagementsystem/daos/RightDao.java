package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadmanagementsystem.entities.Right;

public interface RightDao extends JpaRepository<Right, Long> {

	List<Right> findAllByUserId(Long userId);

}
