package com.leadmanagementsystem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.leadmanagementsystem.filters.JwtAuthenticationFilter;

@Configuration
public class SpringSecurityConfig {

	@Autowired
	private JwtAuthenticationEntryPoint point;
	@Autowired
	private JwtAuthenticationFilter filter;

	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().requestMatchers("/admin").hasRole("ADMIN").requestMatchers("/user").hasAnyRole("ADMIN", "USER")
				.requestMatchers("/authenticate", "/").permitAll().requestMatchers(HttpMethod.OPTIONS, "/**")
				.permitAll().anyRequest().authenticated().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().exceptionHandling(ex -> ex.authenticationEntryPoint(point));
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}
}



//http.csrf(csrf -> csrf.disable()).authorizeRequests().requestMatchers("/test").authenticated()
//.requestMatchers("/authenticate").permitAll().anyRequest().authenticated().and()
//.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
