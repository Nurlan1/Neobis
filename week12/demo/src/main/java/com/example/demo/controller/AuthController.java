package com.example.demo.controller;

import com.example.demo.config.jwt.JwtProvider;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProvider jwtProvider;
    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationRequest registrationRequest){
        UserEntity u= new UserEntity();
        u.setPassword(registrationRequest.getPassword());
        u.setLogin(registrationRequest.getLogin());
        userService.saveUser(u);
        return "OK";
    }
    @PostMapping("/auth")
    public AuthResponse auth(@RequestBody AuthRequest request){
        UserEntity userEntity = userService.findByLoginAndPassword(request.getLogin(),request.getPassword());
        String token=jwtProvider.generateToken(userEntity.getLogin());
        return new AuthResponse(token);
    }
}
