package com.leadmanagementsystem.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Source;

@Repository
public interface SourceDao extends JpaRepository<Source, Long> {
	public List<Source> findAllByUserId(Long userId);

}
