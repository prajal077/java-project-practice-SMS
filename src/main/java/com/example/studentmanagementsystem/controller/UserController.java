package com.example.studentmanagementsystem.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.studentmanagementsystem.model.User;
import com.example.studentmanagementsystem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.add(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id)
    {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteById(@PathVariable int id) {
         userService.deleteById(id);
         return Map.of("Success",true);
    }





}