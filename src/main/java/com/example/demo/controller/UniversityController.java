package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.University;
import com.example.demo.service.UniversityService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities",
                produces = {MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_JSON_VALUE})
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    //get
    @GetMapping
    public List<University> findAll(){
        return universityService.findAll();
    }

    //id is a path variable
    @GetMapping(value = "{id}")
    University findById(@PathVariable long id){
        return universityService.findById(id);
    }

    //create
    @PostMapping
    University createUniversity(
            @Validated(University.Create.class)
            @RequestBody University university){
        return universityService.createUniversity(university);
    }

    //delete
    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable long id){
        universityService.delete(id);
    }

    //patch
    @PatchMapping
    public University updateUniversity(
            @Validated(University.Update.class)
            @RequestBody University university){
        return universityService.update(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@PathVariable long id, @RequestBody University university){
        return universityService.update(id, university);
    }

    @PostMapping(value = "{id}/students")
    public Student createStudent(@PathVariable Long id,
                                 @RequestBody Student student)
    {
        return universityService.createStudent(id, student);
    }
}
