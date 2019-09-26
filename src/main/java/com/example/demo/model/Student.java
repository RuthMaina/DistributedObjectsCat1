package com.example.demo.model;

public class Student {

    private Long id;
    private Long studentNumber;
    private String firstName;

    private Student(){}

    public Student(Long studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Cat1Student{" +
                "studentNumber=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
