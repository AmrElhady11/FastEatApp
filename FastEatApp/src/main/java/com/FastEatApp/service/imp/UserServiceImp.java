package com.FastEatApp.service.imp;

import com.FastEatApp.dao.UserRepository;
import com.FastEatApp.entity.User;
import com.FastEatApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public boolean addUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        Optional<User> theUser = userRepository.findById(id);
        if (!theUser.isPresent()) {
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        Optional<User> theUser = userRepository.findById(user.getId());
        if (!theUser.isPresent()) {
            return false;
        }
        userRepository.save(user);
        theUser.get().setUpdatedAt(LocalDateTime.now());
        return true;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> theUser = userRepository.findById(id);

        return theUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users =userRepository.findAll();
        return users;
    }

}
