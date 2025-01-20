package com.leadManagementSystem1.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadManagementSystem1.entities.Calls;


public interface CallsDao extends JpaRepository<Calls, Long>{

//	List<Calls> findAllCalls(Long userId);


}
