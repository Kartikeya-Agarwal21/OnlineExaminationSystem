package com.exam;

import com.exam.controller.ExamController;
import com.exam.controller.UserController;

public class App {
    public static void main(String[] args) {
        UserController userController = new UserController();
        ExamController examController = new ExamController();

        userController.registerUser("John", "john123");
        userController.loginUser("john123");

        examController.startExam("john123");
    }
}
