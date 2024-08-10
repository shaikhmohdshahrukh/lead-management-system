package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.ProspectDao;
import com.leadmanagementsystem.entities.Prospect;

@Service
public class ProspectService {

	@Autowired
	private ProspectDao prospectRepository;

	public Long createProspect(Prospect prospect) {
		prospect = prospectRepository.save(prospect);
		return prospect.getProspectId();
	}

	public Prospect updateProspect(Prospect prospect) {
		return prospectRepository.save(prospect);
	}

	public void deleteProspect(Long prospectId) {
		prospectRepository.deleteById(prospectId);
	}

	public Optional<Prospect> findProspectById(Long prospectId) {
		return prospectRepository.findById(prospectId);
	}

	public List<Prospect> findAllProspects() {
		return prospectRepository.findAll();
	}

}
