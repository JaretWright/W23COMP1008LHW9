package com.example.w23comp1008lhw9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Experiment {
    public static void main(String[] args) {
//        Person homer = new Person("Homer","Simpson",
//                "342 Springfield Terrace", LocalDate.of(1968,02,13));
//
//        Student bart = new Student("bart","simpson",
//                "342 Springfield Terrace",
//                LocalDate.of(1982,04,15),1234567);
//
//        System.out.println("Person: " + homer.toString());
//        System.out.println("Student: "+bart.toString());

        ArrayList<Course> courses = DBUtility.getCoursesFromDB();

        ArrayList<Student> students = DBUtility.getStudentsFromDB();

        for (Student student : students)
            System.out.println(student);
    }
}
