package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadManagementSystem1.entities.Page;

public interface PageDao extends JpaRepository<Page, Long> {

	List<Page> findAllByUserId(Long userId);

}
