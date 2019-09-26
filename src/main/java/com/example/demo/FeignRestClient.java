package com.example.demo;

import com.example.demo.model.MockAppointments;
import com.example.demo.model.MockLecturer;
import com.example.demo.model.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="mockclient", url="http://10.51.11.230:1000", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method= RequestMethod.POST, value="students")
    MockStudent createStudent(@RequestBody MockStudent mockStudent);

    @RequestMapping(method = RequestMethod.GET, value = "students")
    MockStudent getById(@RequestParam(name = "studentNumber") String studentNumber);

    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
    List<MockLecturer> getAllLecturers();

    @RequestMapping(method = RequestMethod.POST, value="appointments")
    MockAppointments createAppointment(@RequestBody MockAppointments mockAppointments);

    @RequestMapping(method=RequestMethod.PATCH, value="appointments/{id}")
    MockAppointments confirmAppointment(@RequestParam("studentId") Long studentId, @PathVariable(name = "id") Long appointmentId);



}
