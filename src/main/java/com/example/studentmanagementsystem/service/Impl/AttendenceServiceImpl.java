package com.example.studentmanagementsystem.service.Impl;

import com.example.studentmanagementsystem.model.Attendence;
import com.example.studentmanagementsystem.repository.AttendenceRepository;
import com.example.studentmanagementsystem.service.AttendenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AttendenceServiceImpl implements AttendenceService {

    private AttendenceRepository attendenceRepository;

    @Override
    public List<Attendence> findAll() {
        return List.of();
    }

    @Override
    public List<Attendence> findAllByUserId(int userId) {
        return attendenceRepository.findByUserId(userId);
    }

    @Override
    public Attendence addAttendence(Attendence attendence) {
        return attendenceRepository.save(attendence);
    }
}
