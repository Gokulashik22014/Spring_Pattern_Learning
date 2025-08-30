package com.tutorial.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tutorial.learning.concrete.LoginWithGoogleSevice;
import com.tutorial.learning.controller.LoginController;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearningApplication.class, args);
		
		// LoginController login=context.getBean(LoginController.class);
		// login.login();
	}

}
