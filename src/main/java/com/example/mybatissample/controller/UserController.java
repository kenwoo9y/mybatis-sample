package com.example.mybatissample.controller;

import com.example.mybatissample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> findByUserId(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(userService.findByUserId(userId), HttpStatus.OK);
    }
}
