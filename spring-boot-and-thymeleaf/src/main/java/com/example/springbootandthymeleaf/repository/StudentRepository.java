package com.example.springbootandthymeleaf.repository;

import com.example.springbootandthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
