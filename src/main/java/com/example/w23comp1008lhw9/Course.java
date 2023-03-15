package com.example.w23comp1008lhw9;

public class Course {
    
    private int crn;
    private String courseCode, courseName;

    public Course(int crn, String courseCode, String courseName) {
        setCrn(crn);
        setCourseCode(courseCode);
        setCourseName(courseName);
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Typical course codes:  COMP 1008, MGMT 2008, COMP 1011
     *
     * Regular Expressions, often called RegEx define a pattern
     * for a String
     * @param courseCode
     */
    public void setCourseCode(String courseCode) {
        String courseCodePattern = "[A-Z]{4}\\s[0-9]{4}";
        courseCode = courseCode.toUpperCase();

        if (courseCode.matches(courseCodePattern))
            this.courseCode = courseCode;
        else
            throw new IllegalArgumentException("Course code must have 4 " +
                    "letters and 4 numbers (i.e. COMP 1008)");
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
