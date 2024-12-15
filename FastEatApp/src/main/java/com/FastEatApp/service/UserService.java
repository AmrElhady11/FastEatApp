package com.FastEatApp.service;

import com.FastEatApp.entity.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);
    boolean deleteUser(Long id);
    boolean updateUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
}
