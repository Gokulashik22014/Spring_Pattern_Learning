package com.tutorial.learning.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private String gender;
    public StudentModel(){}
    public StudentModel(long id,String name,String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }   
    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getgender(){
        return gender;
    }
}
