package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.model.Attendence;

import java.util.List;

public interface AttendenceService {

    List<Attendence> findAll();
    List<Attendence> findAllByUserId(int userId);
    Attendence addAttendence(Attendence attendence);
}
