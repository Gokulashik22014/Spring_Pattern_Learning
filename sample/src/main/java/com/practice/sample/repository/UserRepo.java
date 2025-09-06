package com.practice.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.sample.models.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Long>{
	UserModel findByName(String name);
}
