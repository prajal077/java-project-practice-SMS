package com.example.studentmanagementsystem.service.Impl;

import com.example.studentmanagementsystem.model.User;
import com.example.studentmanagementsystem.service.AuthService;
import com.example.studentmanagementsystem.service.UserService;
import com.example.studentmanagementsystem.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    
    @Autowired
    private UserService userService;
    
    @Override
    public String login(String username, String password) {
        User user = userService.getByUsername(username);

        if(user == null || !user.getPassword().equals((password))) {
            throw new RuntimeException("Login Failed");
        } else {
            return JwtUtil.generateToken(user);
        }
    }
    
    @Override
    public boolean changePassword(String oldPassword, String newPassword) {
        return false;
    }
    
}
