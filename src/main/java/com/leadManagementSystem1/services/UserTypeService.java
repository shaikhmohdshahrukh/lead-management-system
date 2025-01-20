package com.leadManagementSystem1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadManagementSystem1.daos.UserTypeDao;
import com.leadManagementSystem1.entities.UserType;

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
