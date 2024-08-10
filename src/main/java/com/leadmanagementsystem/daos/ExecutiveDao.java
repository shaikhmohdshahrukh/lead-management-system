package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Executive;

@Repository
public interface ExecutiveDao extends JpaRepository<Executive, Long> {

}
