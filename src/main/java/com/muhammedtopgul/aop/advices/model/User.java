package com.muhammedtopgul.aop.advices.model;

/*
 * created by Muhammed Topgul
 * on 08/08/2021
 * at 16:03
 */

public class User {

    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
