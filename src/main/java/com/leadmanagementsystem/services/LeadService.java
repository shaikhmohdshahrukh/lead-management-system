//package com.leadmanagementsystem.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.leadmanagementsystem.daos.LeadDao;
//import com.leadmanagementsystem.entities.Lead;
//
//@Service
//public class LeadService {
//
//	@Autowired
//	protected LeadDao leadRepository;
//
//	public Long createLeads(Lead lead) {
//		lead = leadRepository.save(lead);
//		return lead.getLeadId();
//	}
//
//	public Lead updateLead(Lead lead) {
//		return leadRepository.save(lead);
//	}
//
//	public void deleteLead(Long leadId) {
//		leadRepository.deleteById(leadId);
//	}
//
//	public Optional<Lead> findLeadById(Long leadId) {
//		return leadRepository.findById(leadId);
//	}
//
//	public List<Lead> findAllLeads() {
//		return leadRepository.findAll();
//	}
//
//	public List<Lead> findAllLeads(Long userId) {
//		return leadRepository.findAllByUserId(userId);
//	}
//}
