package com.leadManagementSystem1.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadManagementSystem1.entities.Source;


@Repository
public interface SourceDao extends JpaRepository<Source, Long> {
	public List<Source> findAllByUserId(Long userId);

}
