package com.example.mybatissample.service;

import java.util.Optional;

import com.example.mybatissample.model.User;

public interface UserService {
    void save(User user);
    
    Optional<User> findById(Long userId);

    void updatePassword(User user);

    void deleteById(Long userId);
}
