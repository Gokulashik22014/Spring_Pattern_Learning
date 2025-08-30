package com.tutorial.learning.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeJsonController {

    @Value("${message.name}")
    public String name="";
    @GetMapping("/json")
    public Map<String, String> getName() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name",name);
        return map;
    }
}
