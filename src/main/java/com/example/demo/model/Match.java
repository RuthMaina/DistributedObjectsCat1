package com.example.demo.model;

public class Match {
    private String gender;
    private Long studentId;
    private Long blindDateId;
    private String reason;


    private Match(){}

    public Match(String gender, Long studentId){
        this.studentId = studentId;
        this.gender = gender;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getBlindDateId() {
        return blindDateId;
    }

    public void setBlindDateId(Long blindDateId) {
        this.blindDateId = blindDateId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Match{" +
                "studentId=" + studentId +
                ", gender='" + gender + '\'' +
                '}';
    }
}
