package com.leadManagementSystem1.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.leadManagementSystem1.entities.Allotment;


@Repository
public interface AllotmentDao extends JpaRepository<Allotment, Long>  {

} 

