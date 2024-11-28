package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.Dto.LoginDto;
import com.example.studentmanagementsystem.model.User;
import com.example.studentmanagementsystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")

public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginDto loginDto) {
       String Token =  authService.login(loginDto.username(), loginDto.password());
        return Map.of("Token", Token);
    }
}
