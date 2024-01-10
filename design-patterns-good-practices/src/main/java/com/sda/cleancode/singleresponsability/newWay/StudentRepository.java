package com.sda.cleancode.singleresponsability.newWay;

public class StudentRepository {
    public void saveInDb(String name){
        System.out.println("Student " + name + " was saved in db");
    }
}
