package com.library.peoplelistapp.model;

public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private static int personNumber = 0;

    public Person() {
        this.id = ++personNumber;
    }


    public Person(int id, String name, String phoneNumber, String email) {
        this();// Automatically increments the id
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
