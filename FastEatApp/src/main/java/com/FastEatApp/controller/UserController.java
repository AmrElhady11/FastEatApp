package com.FastEatApp.controller;

import com.FastEatApp.entity.User;
import com.FastEatApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/AllUsers")
    public List<User> AllUsers() {
        return userService.getAllUsers();

    }
}
