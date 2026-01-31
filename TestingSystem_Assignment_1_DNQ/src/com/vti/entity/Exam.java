package com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Exam {
    public int examID;
    public String code;
    public String title;
    public CategoryQuestion category;
    public int duration;
    public Account creator;
    public Date createDate;
    public Question[] questions;

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
