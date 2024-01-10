package com.sda.cleancode.singleresponsability.oldWay;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(String courseName){
        System.out.println("Student " + name + " was enrolled !");
    }
     public void saveInDb(){
         System.out.println("Student " + name + " was saved in db");
     }

     public void sendEmail(String subject, String body){
         System.out.println("Sneding email subject : " + subject + " to studnet : " + name + "\n" + body);
     }

    public Object getName() {
        return name;
    }
}
