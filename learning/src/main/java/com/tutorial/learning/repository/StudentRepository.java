package com.tutorial.learning.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.learning.models.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}