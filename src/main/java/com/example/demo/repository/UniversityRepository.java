package com.example.demo.repository;

import com.example.demo.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Generics
    create repository with object University with the ID which is a type long
    Its the model class name with the unique identifier which is a long
 */
public interface UniversityRepository extends JpaRepository<University, Long>{

}
