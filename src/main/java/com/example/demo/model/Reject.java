package com.example.demo.model;

public class Reject {
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

    private Long blindDateId;
    private String reason;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    private Long studentId;

    private Reject(){

    }

    public Reject(Long blindDateId, String reason){
        this.blindDateId = blindDateId;
        this.reason = reason;
    }

}
