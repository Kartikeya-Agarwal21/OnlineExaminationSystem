package com.exam.controller;

import com.exam.service.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void registerUser(String name, String username) {
        userService.registerUser(name, username);
    }

    public void loginUser(String username) {
        userService.loginUser(username);
    }
}
