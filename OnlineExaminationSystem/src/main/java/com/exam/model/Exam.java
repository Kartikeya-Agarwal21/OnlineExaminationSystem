package com.exam.model;

import java.util.List;

public class Exam {
    private String username;
    private List<Question> questions;

    public Exam(String username, List<Question> questions) {
        this.username = username;
        this.questions = questions;
    }

    public String getUsername() {
        return username;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
