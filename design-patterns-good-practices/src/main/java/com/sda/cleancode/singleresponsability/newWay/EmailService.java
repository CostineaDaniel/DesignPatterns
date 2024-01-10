package com.sda.cleancode.singleresponsability.newWay;

public class EmailService {

    public void sendEmail(Student name, String subject, String body){
        System.out.println("Sneding email subject : " + subject + " to studnet : " + name.getName() + "\n" + body);
    }
}
