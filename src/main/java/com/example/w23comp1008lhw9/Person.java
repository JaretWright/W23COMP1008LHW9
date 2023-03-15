package com.example.w23comp1008lhw9;

import java.time.LocalDate;

public class Person {
    private String firstName, lastName, address;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String address, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthday(birthday);
    }

    /**
     * format names to remove white spaces and capitalize the first letter
     * @return
     */
    private String formatName(String name)
    {
        name = name.trim();
        if (name.length()>1)
            return name.substring(0,1).toUpperCase() + name.substring(1);

        return name.substring(0,1).toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = formatName(firstName);

        if (firstName.length()>=2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must be at least 2 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = formatName(lastName);
        if (lastName.length()>=2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must be 2 or more characters");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
