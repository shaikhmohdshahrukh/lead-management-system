package com.leadManagementSystem1.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadManagementSystem1.entities.Prospect;

@Repository
public interface ProspectDao extends JpaRepository<Prospect, Long> {

}
