package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.University;
import com.example.demo.repository.UniversityRepository;
import com.example.demo.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;
    private final StudentService studentService;

    public UniversityServiceImpl(UniversityRepository universityRepository, StudentService studentService) {
        this.universityRepository = universityRepository;
        this.studentService = studentService;
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(long id) {
        return universityRepository.findById(id).orElseThrow(()
                ->new NotFoundException("No university found with the id "+id+" found"));
    }

    @Override
    public void delete(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University update(University university) {
        //look for the object based on the id
        University found = findById(university.getId());

        //update the object based on the passed object
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        //save and return data
        return universityRepository.save(found);
    }

    @Override
    public University update(Long id, University university) {
        //look for the object
        University found = findById(id);

        //update the object based on the passed object
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        //save and return data
        return universityRepository.save(found);
    }

    @Override
    public Student createStudent(Long id, Student student) {
        University university = findById(id);
        student.setUniversity(university);
        return studentService.createStudent(student);
    }
}
