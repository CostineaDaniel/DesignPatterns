package com.sda.cleancode.singleresponsability.newWay;

import com.sda.cleancode.singleresponsability.oldWay.Student;

public class StudentApp {
    public static void main(String[] args) {
        // we will create a student and do some 'work' with him

        Student student1 = new Student("John");
        CourseManager courseManager = new CourseManager();
        courseManager.enrollInCourse("Design patterns");

        EmailService emailService = new EmailService();
        emailService.sendEmail(student1.getName(),"Hello");
    }
}

