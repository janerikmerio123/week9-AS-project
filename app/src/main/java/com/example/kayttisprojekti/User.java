package com.example.kayttisprojekti;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    public static int userCounter = 0;  // käyttäjien lukumäärän laskin

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public User(String firstName, String lastName, String email, String degreeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        userCounter++; //--------------------

    }
}
