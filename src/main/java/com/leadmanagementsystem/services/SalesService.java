package com.leadmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leadmanagementsystem.daos.SalesDao;
import com.leadmanagementsystem.entities.Sales;

@Service
public class SalesService {
	@Autowired
	protected SalesDao salesRepository;

	public Long createSales(Sales sales) {
		sales = salesRepository.save(sales);
		return sales.getSalesId();
	}

	public Sales updateSales(Sales sales) {
		return salesRepository.save(sales);
	}

	public void deleteSales(Long salesId) {
		salesRepository.deleteById(salesId);
	}

	public Optional<Sales> findSalesById(Long salesId) {
		return salesRepository.findById(salesId);
	}

	public List<Sales> findAllSales() {
		return salesRepository.findAll();
	}

	public List<Sales> findAllSales(Long userId) {
		return salesRepository.findAllByUserId(userId);
	}

}
