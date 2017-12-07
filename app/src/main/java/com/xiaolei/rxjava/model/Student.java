package com.xiaolei.rxjava.model;

import java.util.List;

/**
 * Created by ZhaoLei on 2017/12/7 15:04
 * E-Mail Address：17610230792@163.com
 */

public class Student {
    String name;
    List<Course> courseList;

    public Student() {
    }

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
