package com.exam.repository;

import com.exam.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {
    private List<Question> questions = new ArrayList<>();

    public void save(Question question) {
        questions.add(question);
    }

    public List<Question> findAll() {
        return questions;
    }
}
