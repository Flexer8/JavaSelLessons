package com.company.lambda;


public class Person {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String firstName;
    private String lastName;

    public Person(){}

    public  Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
