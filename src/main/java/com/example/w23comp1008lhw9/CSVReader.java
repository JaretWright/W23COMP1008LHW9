package com.example.w23comp1008lhw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("students.csv"));
            while (scanner.hasNext())
            {
                String[] student = scanner.nextLine().split(",");
                System.out.printf("first name: %s%n",student[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
