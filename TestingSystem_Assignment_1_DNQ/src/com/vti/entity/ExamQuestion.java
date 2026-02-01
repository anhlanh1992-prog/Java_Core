package com.vti.entity;

import java.util.Arrays;

public class ExamQuestion {
    public Exam exam;
    public Question [] questions;

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "exam=" + exam +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
