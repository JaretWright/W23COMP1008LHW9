package com.example.w23comp1008lhw9;

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


}
