package com.leadmanagementsystem.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.leadmanagementsystem.entities.User;


public class MyUserDetails implements UserDetails {

	User user;

	public MyUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> listGrantedAuthority = new ArrayList<>();
		if (user.isAdmin()) {
			SimpleGrantedAuthority sa = new SimpleGrantedAuthority("ROLE_ADMIN");
			listGrantedAuthority.add(sa);
		} else {
			SimpleGrantedAuthority sa = new SimpleGrantedAuthority("ROLE_USER");
			listGrantedAuthority.add(sa);
		}
		return listGrantedAuthority;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
