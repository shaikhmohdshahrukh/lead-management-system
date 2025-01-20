package com.leadManagementSystem1.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadManagementSystem1.daos.PageDao;
import com.leadManagementSystem1.entities.Page;

@Service
public class PageService {
	
	@Autowired
	protected PageDao pageRepository;

	public Long createPage(Page page) {
		page = pageRepository.save(page);
		return page.getPageId();
	}

	public Page updatePage(Page Page) {
		return pageRepository.save(Page);
	}

	public void deletePage(Long pageId) {
		pageRepository.deleteById(pageId);
	}

	public Optional<Page> findPageById(Long pageId) {
		return pageRepository.findById(pageId);
	}

	public List<Page> findAllPage() {
		return pageRepository.findAll();
	}

	public List<Page> findAllPage(Long userId) {
		return pageRepository.findAllByUserId(userId);
	}
}
