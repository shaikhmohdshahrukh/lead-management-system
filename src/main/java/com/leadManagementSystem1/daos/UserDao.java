package com.leadManagementSystem1.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadManagementSystem1.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	Optional<User> findByUserName(String userName);

}
