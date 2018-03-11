package com.company.Users;

import java.util.ResourceBundle;

public class UserFactory {
    public static User getValidUser (int sequenceNo) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
        return new User(resourceBundle.getString("login").split(", ")[sequenceNo-1],
                resourceBundle.getString("password").split(", ")[sequenceNo-1],
                resourceBundle.getString("email").split(", ")[sequenceNo-1]);
        //Utils.Random.getRandomEmail()
    }
}