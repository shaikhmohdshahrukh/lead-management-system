package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Allotment;
@Repository
public interface AllotmentDao extends JpaRepository<Allotment, Long>  {

} 

