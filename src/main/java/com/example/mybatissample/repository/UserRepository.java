package com.example.mybatissample.repository;

import java.util.Optional;

import com.example.mybatissample.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public User saveUser(User user);
    
    public Optional<User> findByUserId(String userId);

    public void changePassword(User user);
}
