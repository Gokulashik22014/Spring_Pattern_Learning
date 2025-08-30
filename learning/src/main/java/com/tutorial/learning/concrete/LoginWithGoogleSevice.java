package com.tutorial.learning.concrete;

import org.springframework.stereotype.Service;

import com.tutorial.learning.interfaces.LoginService;

@Service("Google")
public class LoginWithGoogleSevice implements LoginService {


    @Override
    public void display(){
        System.out.println("Your are Logging in using google");
    }
}
