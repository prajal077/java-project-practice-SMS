package com.example.studentmanagementsystem.controller;


import com.example.studentmanagementsystem.model.Attendence;
import com.example.studentmanagementsystem.service.AttendenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendence")
public class AttendenceController {
    @Autowired
    private AttendenceService attendenceService;

    @PostMapping
    Attendence add(@RequestBody Attendence attendance){
        return attendenceService.addAttendence(attendance);
    }

    @GetMapping
    public List<Attendence> listAll(){
        return attendenceService.findAll();
    }

    @GetMapping("/user")
    public List<Attendence> findByUserId(@RequestParam int userId){
        return attendenceService.findAllByUserId(userId);
    }
}