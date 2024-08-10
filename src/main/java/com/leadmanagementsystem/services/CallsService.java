package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leadmanagementsystem.daos.CallsDao;
import com.leadmanagementsystem.entities.Calls;

@Service
public class CallsService {

	@Autowired
	protected CallsDao callsRepository;

	public Long createCalls(Calls calls) {
		calls = callsRepository.save(calls);
		return calls.getCallsId();
	}

	public Calls updateCalls(Calls calls) {
		return callsRepository.save(calls);
	}

	public void deleteCalls(Long callsId) {
		callsRepository.deleteById(callsId);
	}

	public Optional<Calls> findCallsById(Long callsId) {
		return callsRepository.findById(callsId);
	}

	public List<Calls> findAllCalls() {
		return callsRepository.findAll();
	}

//	public List<Calls> findAllCalls(Long userId) {
//		return callsRepository.findAllCalls(userId);
//	}

}
