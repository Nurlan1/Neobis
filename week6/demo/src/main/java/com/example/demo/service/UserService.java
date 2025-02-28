package com.example.demo.service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserDTO userDTO);
}