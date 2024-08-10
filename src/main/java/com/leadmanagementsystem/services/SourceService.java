package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadmanagementsystem.daos.SourceDao;
import com.leadmanagementsystem.entities.Source;

@Service
public class SourceService {

	@Autowired
	protected SourceDao sourceRepository;

	public Long createSource(Source source) {
		source = sourceRepository.save(source);
		return source.getSourceId();
	}

	public Source updateSource(Source source) {
		return sourceRepository.save(source);
	}

	public void deleteSourse(Long sourceId) {
		sourceRepository.deleteById(sourceId);
	}

	public Optional<Source> findSourceById(Long sourceId) {
		return sourceRepository.findById(sourceId);
	}

	public List<Source> findAllSources() {
		return sourceRepository.findAll();
	}

	public List<Source> findAllSources(Long userId) {
		return sourceRepository.findAllByUserId(userId);
	}

}
