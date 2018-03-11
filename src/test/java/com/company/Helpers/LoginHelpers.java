package com.company.Helpers;

import com.company.Pages.LoginPage;
import com.company.Users.User;
import com.company.Users.UserFactory;

public class LoginHelpers extends LoginPage {
    static User validUser, receiver;
    static {
        validUser = UserFactory.getValidUser(1);
        receiver = UserFactory.getValidUser(2);
    }
    public void loginValidUser() {
        login(validUser.getEmail(),validUser.getPassword());
    }

    public void loginAsReceiver() {
        login(receiver.getName(), receiver.getPassword());
    }
}