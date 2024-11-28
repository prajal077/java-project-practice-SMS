package com.example.studentmanagementsystem.service;
import com.example.studentmanagementsystem.model.User;
import java.util.List;

public interface UserService {

    User add(User user);
    List<User>  getAll();
    void deleteById(int id);
    User updateUser(User user, int id);
    User getById(int id);
    User getByUsername(String username);
}