package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.UserType;

@Repository
public interface UserTypeDao extends JpaRepository<UserType, Long> {

}
