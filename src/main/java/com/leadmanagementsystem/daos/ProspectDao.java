package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Prospect;

@Repository
public interface ProspectDao extends JpaRepository<Prospect, Long> {

}
