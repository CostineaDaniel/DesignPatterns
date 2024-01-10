package com.sda.cleancode.singleresponsability.newWay;

public class CourseManager {
    public void saveInDb(String name){
        System.out.println("Student " + name + " was saved in db");
    }
    public void enrollInCourse(String name){
        System.out.println("Student " + name + " was enrolled !");
    }
}
