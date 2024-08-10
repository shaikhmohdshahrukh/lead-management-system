package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.BusinessDao;
import com.leadmanagementsystem.entities.Business;

@Service
public class BusinessService {

	@Autowired
	protected BusinessDao businessRepository;

	public Long createBusiness(Business business) {
		business = businessRepository.save(business);
		return business.getBusinessId();
	}

	public Business updateBusiness(Business business) {
		return businessRepository.save(business);
	}

	public void deleteBusiness(Long bsinessId) {
		businessRepository.deleteById(bsinessId);
	}

	public Optional<Business> findBusinessById(Long businessId) {
		return businessRepository.findById(businessId);
	}

	public List<Business> findAllBusinesss() {
		return businessRepository.findAll();
	}

	public List<Business> findAllBusinesss(Long userId) {
		return businessRepository.findAllByUserId(userId);
	}

}
