package com.tutorial.learning.concrete;

import org.springframework.stereotype.Service;

import com.tutorial.learning.interfaces.LoginService;

@Service("Email")
public class LoginWithEmail implements LoginService{
    @Override
    public void display(){
        System.out.println("You are loggin in using email");
    }
}
