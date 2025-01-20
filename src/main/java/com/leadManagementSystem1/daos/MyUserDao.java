package com.leadManagementSystem1.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadManagementSystem1.entities.MyUser;

@Repository
public interface MyUserDao extends JpaRepository<MyUser, Long> {

}
