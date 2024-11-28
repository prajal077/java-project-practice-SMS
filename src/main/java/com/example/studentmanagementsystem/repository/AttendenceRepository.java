package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.model.Attendence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendenceRepository extends JpaRepository <Attendence, Integer >{

    List<Attendence> findByUserId (int userId);
}
