package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> readStudents();

    List<Student> fibdByLastName(String theLastName);

    Student changeFirtName(String newName, Integer i);

    int deleteStudent(Integer id);

    int deleteAll();
}
