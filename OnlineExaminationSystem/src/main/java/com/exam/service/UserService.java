package com.exam.service;

import com.exam.model.User;
import com.exam.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void registerUser(String name, String username) {
        User user = new User(name, username);
        userRepository.save(user);
    }

    public void loginUser(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            System.out.println("User " + user.getName() + " logged in successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}
