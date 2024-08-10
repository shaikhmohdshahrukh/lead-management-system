package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadmanagementsystem.entities.Page;

public interface PageDao extends JpaRepository<Page, Long> {

	List<Page> findAllByUserId(Long userId);

}
