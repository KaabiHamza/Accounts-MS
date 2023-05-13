package com.example.authenticationservice.service;

import com.example.authenticationservice.model.User;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
}