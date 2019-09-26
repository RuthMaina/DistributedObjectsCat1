package com.example.demo;

import com.example.demo.model.Appointments;
import com.example.demo.model.Lecturer;
import com.example.demo.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="mockclient", url="http://10.51.11.230:1000", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method= RequestMethod.POST, value="students")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.GET, value = "students")
    Student getById(@RequestParam(name = "studentNumber") String studentNumber);

    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
    List<Lecturer> getAllLecturers();

    @RequestMapping(method = RequestMethod.POST, value="appointments")
    Appointments createAppointment(@RequestBody Appointments appointments);

    @RequestMapping(method=RequestMethod.PATCH, value="appointments/{id}")
    Appointments confirmAppointment(@RequestParam("studentId") Long studentId, @PathVariable(name = "id") Long appointmentId);



}
