package com.phonebook.tests;

public class User {

    private String password;
    private String email;

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
