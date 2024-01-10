package com.sda.cleancode.singleresponsability.oldWay;

public class StudentApp {
    public static void main(String[] args) {
        // we will create a student and do some 'work' with him

    Student student1 = new Student("John");
    student1.enrollInCourse("Design patterns");
    student1.saveInDb();
    student1.sendEmail("Hello","Course will take place at 9");
    }
}

