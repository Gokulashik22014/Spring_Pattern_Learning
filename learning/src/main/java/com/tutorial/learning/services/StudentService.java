package com.tutorial.learning.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tutorial.learning.models.StudentModel;
import com.tutorial.learning.repository.StudentRepository;
import java.util.*;

@Service
public class StudentService{

    private final StudentRepository repo;
    @Autowired
    public StudentService(StudentRepository repo){
        this.repo=repo;
    }

    List<StudentModel> students = Arrays.asList(new StudentModel(1,"Ram","male"),new StudentModel(2,"Sham","male"));

    public List<StudentModel> getStudents(){
        return repo.findAll();
    }

    public void fillStudents(){
        repo.saveAll(students);
    }

}