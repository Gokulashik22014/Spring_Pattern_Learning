package com.tutorial.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.learning.interfaces.LoginService;

@RestController
public class LoginController {
    private LoginService loginService;
    
    public LoginController(@Qualifier("Email") LoginService loginService){
        this.loginService=loginService;
    }

    @GetMapping("/login")
    public void login(){
        loginService.display();
    }
}
