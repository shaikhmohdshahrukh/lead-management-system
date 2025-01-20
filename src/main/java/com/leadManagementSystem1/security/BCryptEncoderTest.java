package com.leadManagementSystem1.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println("Encoded Password : " + encoder.encode("pass1"));
	}
}
