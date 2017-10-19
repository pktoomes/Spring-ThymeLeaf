package com.example.demo;

import java.awt.*;

public class Student {
    private String firstName;
    private String lastName;
    private Grade grade;
    private boolean isHonorRoll;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isHonorRoll() {
        return isHonorRoll;
    }

    public void setHonorRoll(boolean honorRoll) {
        isHonorRoll = honorRoll;
    }
}
