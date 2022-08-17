package com.example.mybatissample.service;

import java.util.List;
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
    public void save(User user) {
        this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.userRepository.findById(userId);
    };

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public void updatePassword(User user) {
        this.userRepository.updatePassword(user);
    }

    @Override
    @Transactional
    public void deleteById(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
