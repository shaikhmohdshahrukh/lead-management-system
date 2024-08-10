package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.UserDao;
import com.leadmanagementsystem.entities.User;
@Service
public class UserService {

	@Autowired
	private UserDao userRepository;

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	public Optional<User> findUserById(Long userId) {
		return userRepository.findById(userId);
	}

	public Optional<User> findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

}
