package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.UserTypeDao;
import com.leadmanagementsystem.entities.UserType;

@Service
public class UserTypeService {

	@Autowired
	protected UserTypeDao userTypeRepository;

	public void createUserType(UserType userType) {
		userTypeRepository.save(userType);
	}

	public List<UserType> findAllUserTypes() {
		return userTypeRepository.findAll();
	}

	public void updateUserType(UserType userType) {
		userTypeRepository.save(userType);
	}

	public void deleteUserType(Long userTypeId) {
		userTypeRepository.deleteById(userTypeId);
	}

	public UserType findUserTypeById(Long userTypeId) {
		Optional<UserType> userType = userTypeRepository.findById(userTypeId);
		return userType.get();
	}

}
