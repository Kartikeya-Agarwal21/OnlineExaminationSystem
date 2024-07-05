package com.exam.controller;

import com.exam.service.ExamService;

public class ExamController {
    private ExamService examService;

    public ExamController() {
        this.examService = new ExamService();
    }

    public void startExam(String username) {
        examService.startExam(username);
    }
}
