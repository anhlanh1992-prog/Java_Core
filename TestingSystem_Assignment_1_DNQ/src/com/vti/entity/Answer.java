package com.vti.entity;

public class Answer {
    public int answerID;
    public String content;
    public Question questionID;
    public boolean isCorrect;

    @Override
    public String toString() {
        return "Answer{" +
                "answerID=" + answerID +
                ", content='" + content + '\'' +
                ", questionID=" + questionID +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
