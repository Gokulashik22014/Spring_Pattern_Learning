package com.practice.sample.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.sample.models.UserModel;
import com.practice.sample.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	public UserRepo repo;
	
	public CustomUserDetailsService() {
	}

	public CustomUserDetailsService(UserRepo repo) {
		this.repo=repo;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserModel user=repo.findByName(username);
		return User.withUsername(user.getName()).password(user.getPassword()).roles("USER").build();
	}

}
