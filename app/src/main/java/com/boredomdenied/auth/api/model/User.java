package com.boredomdenied.auth.api.model;

/**
 * Created by boredomdenied on 12/16/17.
 */

public class User {

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
