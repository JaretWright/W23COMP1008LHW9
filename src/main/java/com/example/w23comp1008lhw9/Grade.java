package com.example.w23comp1008lhw9;

public class Grade {
    
    private int studentNum, crn, grade;

    public Grade(int studentNum, int crn, int grade) {
        setStudentNum(studentNum);
        setCrn(crn);
        setGrade(grade);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <=100)
            this.grade = grade;
        else
            throw new IllegalArgumentException("grade must be in the range 0-100");
    }
}
