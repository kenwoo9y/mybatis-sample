package com.example.mybatissample.service;

import java.util.Optional;

import com.example.mybatissample.model.User;

public interface UserService {
    User saveUser(User user);
    
    Optional<User> findByUserId(String userId);

    void changePassword(User user);
}
