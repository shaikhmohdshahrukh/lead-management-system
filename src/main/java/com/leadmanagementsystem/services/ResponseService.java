package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.ResponseDao;
import com.leadmanagementsystem.entities.Response;

@Service
public class ResponseService {

	@Autowired
	protected ResponseDao responseRepository;

	public Long createResponse(Response response) {
		response = responseRepository.save(response);
		return response.getResponseId();
	}

	public Response updateResponse(Response response) {
		return responseRepository.save(response);
	}

	public void deleteResponse(Long responseId) {
		responseRepository.deleteById(responseId);
	}

	public Optional<Response> findResponseById(Long responseId) {
		return responseRepository.findById(responseId);
	}

	public List<Response> findAllResponses() {
		return responseRepository.findAll();
	}

}
