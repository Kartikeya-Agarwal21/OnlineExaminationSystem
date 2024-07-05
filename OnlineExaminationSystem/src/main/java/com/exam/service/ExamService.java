package com.exam.service;

import com.exam.model.Exam;
import com.exam.model.Question;
import com.exam.repository.ExamRepository;
import com.exam.repository.QuestionRepository;

import java.util.List;

public class ExamService {
    private ExamRepository examRepository;
    private QuestionRepository questionRepository;

    public ExamService() {
        this.examRepository = new ExamRepository();
        this.questionRepository = new QuestionRepository();

        loadSampleQuestions();
    }

    public void startExam(String username) {
        List<Question> questions = questionRepository.findAll();
        Exam exam = new Exam(username, questions);
        examRepository.save(exam);

        System.out.println("Exam started for user: " + username);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
        }
    }

    private void loadSampleQuestions() {
        questionRepository.save(new Question("What is Java?", new String[]{"Programming Language", "OS", "IDE", "Browser"}, "Programming Language"));
        questionRepository.save(new Question("What is OOP?", new String[]{"Object Oriented Programming", "Object Oriented Procedure", "Open Object Programming", "None"}, "Object Oriented Programming"));
    }
}
