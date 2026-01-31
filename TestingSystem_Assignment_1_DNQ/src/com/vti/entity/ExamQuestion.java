package com.vti.entity;

public class ExamQuestion {
    public Exam exam;
    public Question questionID;

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "exam=" + exam +
                ", questionID=" + questionID +
                '}';
    }
}
