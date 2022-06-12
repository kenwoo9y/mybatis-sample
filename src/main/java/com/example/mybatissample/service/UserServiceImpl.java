package com.example.mybatissample.service;

import java.util.Optional;

import com.example.mybatissample.model.User;
import com.example.mybatissample.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findByUserId(String userId) {
        return this.userRepository.findByUserId(userId);
    };
}
