package com.example.demo;

import com.example.demo.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.awt.desktop.UserSessionEvent;
import java.util.List;

@FeignClient(name="mockclient", url="http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method= RequestMethod.POST, value="students")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    String getMatch(@RequestParam("studentId") Long studentId, @RequestParam(name = "gender") String gender);

    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
    Reject rejectMatch(@PathVariable("blindDateId") Long id, @RequestBody String reject);

//    @RequestMapping(method = RequestMethod.POST, value="matches")
//    Match getMatch(@RequestBody Match match);

//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    Student getById(@RequestParam(name = "studentNumber") String studentNumber);

//    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
//    List<Lecturer> getAllLecturers();

//    @RequestMapping(method = RequestMethod.POST, value="appointments")
//    Appointments createAppointment(@RequestBody Appointments appointments);

//    @RequestMapping(method=RequestMethod.PATCH, value="appointments/{id}")
//    Appointments confirmAppointment(@RequestParam("studentId") Long studentId, @PathVariable(name = "id") Long appointmentId);



}
