package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.MyUserDao;
import com.leadmanagementsystem.entities.MyUser;

@Service
public class MyUserService {

	@Autowired
	private MyUserDao myUserRepository;

	public Long createMyUser(MyUser myUser) {
		myUser = myUserRepository.save(myUser);
		return myUser.getMyUserId();
	}

	public MyUser updateMyUser(MyUser myUser) {
		return myUserRepository.save(myUser);
	}

	public void deleteMyUser(Long myUserId) {
		myUserRepository.deleteById(myUserId);
	}

	public Optional<MyUser> findMyUserById(Long myUserId) {
		return myUserRepository.findById(myUserId);
	}

	public List<MyUser> findAllMyUsers() {
		return myUserRepository.findAll();
	}
}
