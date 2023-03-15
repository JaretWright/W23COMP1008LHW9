package com.example.w23comp1008lhw9;

import java.time.LocalDate;

public class Experiment {
    public static void main(String[] args) {
        Person homer = new Person("Homer","Simpson",
                "342 Springfield Terrace", LocalDate.of(1968,02,13));

        System.out.println(homer);

    }
}
