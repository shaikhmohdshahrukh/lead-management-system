//package com.leadmanagementsystem.daos;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.leadmanagementsystem.entities.Lead;
//import com.leadmanagementsystem.repository.LeadRepository;
//
//@Repository
//public class LeadDaoImpl implements LeadDao{
//	
//	@Autowired
//	private LeadRepository leadRepo;
//
//	@Override
//	public List<Lead> findAllByUserId(Long userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Lead> findAllByGenderAndLocation(String gender, String location) {
//		// TODO Auto-generated method stub
//		return leadRepo.fetchByAddAndLoc(gender, location);
//	}
//
//}
