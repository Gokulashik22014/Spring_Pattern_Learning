package com.practice.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.sample.models.UserModel;
import com.practice.sample.services.UserService;

@RestController
public class UserController {
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	@PostMapping("/add-user")
	public void addUser(@RequestBody UserModel user) {
//		UserModel user=new UserModel("naruto","customer","1234");
		userService.addUser(user);
		return;
	}
	
	@GetMapping("/get-users")
	public List<UserModel> getUsers(){
		return userService.getAllUser();
	}
}
