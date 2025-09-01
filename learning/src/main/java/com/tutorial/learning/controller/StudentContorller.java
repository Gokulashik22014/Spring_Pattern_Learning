package com.tutorial.learning.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.tutorial.learning.services.StudentService;
import com.tutorial.learning.models.StudentModel;
import java.util.*;

@RestController
public class StudentContorller{

    @Autowired
    StudentService stSer;

    @GetMapping("/get-students")
    public List<StudentModel> getStudents(){
        return stSer.getStudents();
    }

    @PostMapping("/put-students")
    public void addStudents(){
        stSer.fillStudents();
    }
}