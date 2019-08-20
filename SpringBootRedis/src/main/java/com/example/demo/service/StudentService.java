package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAll();

    Student getStudent(String numberCode);

    int delete(String numberCode);

    int update(Student student);

    int insert(Student student);

}
