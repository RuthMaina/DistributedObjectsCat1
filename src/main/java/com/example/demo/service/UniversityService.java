package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.University;

import java.util.List;

public interface UniversityService {
    List<University> findAll();

    University findById(long id);

    void delete(Long id);

    University createUniversity(University university);

    University update(University university);

    University update(Long id, University university);

    Student createStudent(Long id, Student student);
}
