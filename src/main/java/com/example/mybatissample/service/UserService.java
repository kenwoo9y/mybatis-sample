package com.example.mybatissample.service;

import java.util.Optional;

import com.example.mybatissample.model.User;

public interface UserService {
    Optional<User> findByUserId(String userId);
}
