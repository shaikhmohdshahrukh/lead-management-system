package com.leadManagementSystem1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadManagementSystem1.daos.LeadDao;
import com.leadManagementSystem1.entities.Lead;

@Service
public class LeadService {

	@Autowired
	protected LeadDao leadRepository;

	public Long createLead(Lead lead) {
		lead = leadRepository.save(lead);
		return lead.getLeadId();
	}

	public Lead updateLead(Lead lead) {
		return leadRepository.save(lead);
	}

	public void deleteLead(Long leadId) {
		leadRepository.deleteById(leadId);
	}

	public Optional<Lead> findLeadById(Long leadId) {
		return leadRepository.findById(leadId);
	}

	public List<Lead> findAllLead() {
		return leadRepository.findAll();
	}
	public List<Lead> findAllLeadUserId(Long userId) {
		return leadRepository.findAll();
	}
}
