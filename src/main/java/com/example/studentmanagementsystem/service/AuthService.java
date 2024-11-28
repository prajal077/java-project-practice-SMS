package com.example.studentmanagementsystem.service;

public interface AuthService {

    String login(String username, String password);
    boolean changePassword (String oldPassword, String newPassword);
}
