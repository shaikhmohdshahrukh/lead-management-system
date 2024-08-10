package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}