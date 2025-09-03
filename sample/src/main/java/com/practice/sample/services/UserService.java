package com.practice.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.sample.models.UserModel;
import com.practice.sample.repository.UserRepo;

@Service
public class UserService {
	
	private final UserRepo repo;
	@Autowired
	public UserService(UserRepo repo) {
		this.repo=repo;
	}
	
	public void addUser(UserModel user) {
		user.setRole("customer");
		repo.save(user);
		return;
	}
	
	public List<UserModel> getAllUser(){
		return repo.findAll();
	}
}
