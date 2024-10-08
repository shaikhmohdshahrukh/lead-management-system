package com.leadmanagementsystem.security;

public class AuthenticationRequest {

	private String username;
	private String password;

	public AuthenticationRequest() {
		username = new String();
		password = new String();
	}

	public AuthenticationRequest(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
