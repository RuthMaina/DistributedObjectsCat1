package com.example.demo;

import com.example.demo.model.MockAppointments;
import com.example.demo.model.MockLecturer;
import com.example.demo.model.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientConnection implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public ClientConnection(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

//        MockStudent student = feignRestClient.createStudent(new MockStudent("95885", "Ruth"));
////        System.out.println("Student added: "+ student);
//
//        MockStudent getStudent = feignRestClient.getById(student.getStudentNumber());
////        System.out.println("Me:" + getStudent);
//
//        List<MockLecturer> allLecturers = feignRestClient.getAllLecturers();
////        System.out.println("All Lecturers:" +allLecturers);
//
//        MockAppointments appointment = feignRestClient.createAppointment(new MockAppointments(student.getid(), (long)2));
////        System.out.println("Appointment added: "+ appointment);
//
//        MockAppointments confirmAppointment = feignRestClient.confirmAppointment(student.getid(), appointment.getId());
////        System.out.println("Appointment confirmed: "+ confirmAppointment);
    }
}
