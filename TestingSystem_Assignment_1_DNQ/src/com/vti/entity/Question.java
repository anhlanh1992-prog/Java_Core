package com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Question {
    public int questionID;
    public String content;
    public CategoryQuestion category;
    public TypeQuestion type;
    public Account creator;
    public Date createDate;
    public Exam[] exams;

    @Override
    public String toString() {
        return "Question{" +
                "questionID=" + questionID +
                ", content='" + content + '\'' +
                ", category=" + category +
                ", type=" + type +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", exams=" + Arrays.toString(exams) +
                '}';
    }
}
