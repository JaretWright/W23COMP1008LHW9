package com.example.w23comp1008lhw9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
    private int studentNum;
    private ArrayList<Grade> grades;

    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNum, ArrayList<Grade> grades) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        this.grades = grades;
    }

    /**
     *  This is constructor is said to be "over loaded" meaning there are 2 constructors,
     *  but they have different arguments
     */
    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNum) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        this.grades = new ArrayList<>();
    }



    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if (studentNum>= 1000000 && studentNum <= 9999999)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be a 7 digit number");
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
    @Override
    public String toString()
    {
        return String.format("%s, student number: %d",super.toString(),studentNum);
    }
}
