package com.example.studentmanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "attendence")


public class Attendence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int count;
    private String semester;

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getSemester() {
        return semester;
    }

    public User getUser() {
        return user;
    }

    @ManyToOne
    private User user;

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
