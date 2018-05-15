package com.study.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Student {
    @JsonProperty(value="anothername")
    private String name;
    private int age;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
