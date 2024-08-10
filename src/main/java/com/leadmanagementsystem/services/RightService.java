package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leadmanagementsystem.daos.RightDao;
import com.leadmanagementsystem.entities.Right;

@Service
public class RightService {

	@Autowired
	protected RightDao rightRepository;

	public Long createRight(Right right) {
		right = rightRepository.save(right);
		return right.getRightId();
	}

	public Right updateRight(Right right) {
		return rightRepository.save(right);
	}

	public void deleteRight(Long rightId) {
		rightRepository.deleteById(rightId);
	}

	public Optional<Right> findRightById(Long rightId) {
		return rightRepository.findById(rightId);
	}

	public List<Right> findAllRight() {
		return rightRepository.findAll();
	}

	public List<Right> findAllRight(Long userId) {
		return rightRepository.findAllByUserId(userId);
	}

}
