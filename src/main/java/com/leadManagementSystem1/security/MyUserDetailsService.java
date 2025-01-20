package com.leadManagementSystem1.security;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.leadManagementSystem1.entities.User;
import com.leadManagementSystem1.services.UserService;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userService.findByUserName(userName);
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found : " + userName));
		MyUserDetails userDetails = new MyUserDetails(user.get());
		return userDetails;
	}
}
