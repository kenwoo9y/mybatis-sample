package com.example.mybatissample.repository;

import java.util.Optional;

import com.example.mybatissample.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public void save(User user);
    
    public Optional<User> findById(Long userId);

    public void updatePassword(User user);

    public void deleteById(Long userId);
}
