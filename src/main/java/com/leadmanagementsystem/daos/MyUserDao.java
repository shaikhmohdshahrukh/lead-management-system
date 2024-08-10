package com.leadmanagementsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadmanagementsystem.entities.MyUser;

@Repository
public interface MyUserDao extends JpaRepository<MyUser, Long> {

}
