package com.example.mybatissample.service;

import java.util.Optional;

import com.example.mybatissample.model.User;
import com.example.mybatissample.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return this.userRepository.saveUser(user);
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        return this.userRepository.findByUserId(userId);
    };

    @Override
    @Transactional
    public void changePassword(User user) {
        this.userRepository.changePassword(user);
    }
}
