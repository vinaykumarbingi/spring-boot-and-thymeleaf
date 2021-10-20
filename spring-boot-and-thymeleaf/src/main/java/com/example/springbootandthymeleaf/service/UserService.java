package com.example.springbootandthymeleaf.service;

import com.example.springbootandthymeleaf.model.User;
import com.example.springbootandthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
