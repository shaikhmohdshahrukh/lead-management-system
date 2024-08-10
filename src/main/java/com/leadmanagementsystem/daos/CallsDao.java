package com.leadmanagementsystem.daos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leadmanagementsystem.entities.Calls;

public interface CallsDao extends JpaRepository<Calls, Long>{

//	List<Calls> findAllCalls(Long userId);


}
