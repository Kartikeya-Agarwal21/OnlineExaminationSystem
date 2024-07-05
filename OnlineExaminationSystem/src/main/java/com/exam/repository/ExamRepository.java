package com.exam.repository;

import com.exam.model.Exam;

import java.util.HashMap;
import java.util.Map;

public class ExamRepository {
    private Map<String, Exam> exams = new HashMap<>();

    public void save(Exam exam) {
        exams.put(exam.getUsername(), exam);
    }

    public Exam findByUsername(String username) {
        return exams.get(username);
    }
}
