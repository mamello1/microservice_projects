package com.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.controller.dto.UserRegistrationDto;
import com.example.model.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
