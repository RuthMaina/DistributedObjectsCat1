package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClientConnection implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public ClientConnection(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

//        Student student = feignRestClient.createStudent(new Student("95885", "Ruth"));
////        System.out.println("Student added: "+ student);
//
//        Student getStudent = feignRestClient.getById(student.getStudentNumber());
////        System.out.println("Me:" + getStudent);
//
//        List<Lecturer> allLecturers = feignRestClient.getAllLecturers();
////        System.out.println("All Lecturers:" +allLecturers);
//
//        Appointments appointment = feignRestClient.createAppointment(new Appointments(student.getid(), (long)2));
////        System.out.println("Appointment added: "+ appointment);
//
//        Appointments confirmAppointment = feignRestClient.confirmAppointment(student.getid(), appointment.getId());
////        System.out.println("Appointment confirmed: "+ confirmAppointment);
    }
}
