package com.example.w23comp1008lhw9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {

    private static String user="student";
    private static String password="student";

    //jdbc:mysql - this is telling the system which SQL driver to use
    //127.0.0.1:3306 - tells Java the MySQL server address is 127.0.0.1 and port is 3306
    //edmuse2033 - this is the database name
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/edmuse2023";

    //To connect with a MySQL server
    //1.  we uploaded the dependency in the POM.xml file
    //2.  We need to update the module.info file with using java.sql;
    //3.  We need the connection details defined above

    /**
     * This method will query the DB and return a list of all the courses
     */
    public static ArrayList<Course> getCoursesFromDB()
    {
        ArrayList<Course> courses = new ArrayList<>();

        //connect to the database
        //try () with round brackets indicates that it is a "try with resources", that
        //means anything inside the () will automatically be closed when the method
        //completes
        try (
               Connection conn = DriverManager.getConnection(connectUrl,user,password);
               Statement statement = conn.createStatement();
               ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");
                )
        {
            //loop over the resultSet and create Course objects
            while (resultSet.next())
            {
                int crn = resultSet.getInt("crn");
                String courseCode = resultSet.getString("courseCode");
                String courseName = resultSet.getString("courseName");

                courses.add(new Course(crn,courseCode,courseName));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return courses;
    }

    private static ArrayList<Grade> getGradesFromDB(int studentNum)
    {
        ArrayList<Grade> grades = new ArrayList<>();

        //connect to the database
        //try () with round brackets indicates that it is a "try with resources", that
        //means anything inside the () will automatically be closed when the method
        //completes
        try (
                Connection conn = DriverManager.getConnection(connectUrl,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet =
                        statement.executeQuery("SELECT * FROM grades WHERE studentNum ="+studentNum);
        )
        {
            //loop over the resultSet and create Course objects
            while (resultSet.next())
            {
                int crn = resultSet.getInt("crn");
                int grade = resultSet.getInt("grade");

                grades.add(new Grade(studentNum,crn,grade));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return grades;
    }

}
