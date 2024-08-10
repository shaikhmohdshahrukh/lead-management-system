//package com.leadmanagementsystem.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//
//import com.leadmanagementsystem.entities.Lead;
//
//public interface LeadRepository {
//	
//	@Query("select * from lead where address=?0 and location=?1")
//	public List<Lead> fetchByAddAndLoc(String add, String loc);
//
//}
