package com.example.mybatissample.repository;

import com.example.mybatissample.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public User getUser(String userName);
}
