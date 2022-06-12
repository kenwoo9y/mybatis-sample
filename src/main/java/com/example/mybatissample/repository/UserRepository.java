package com.example.mybatissample.repository;

import java.util.Optional;

import com.example.mybatissample.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public Optional<User> findByUserId(String userId);
}
