package com.company.Helpers;

import com.company.Pages.StartPage;
import com.company.Users.User;
import com.company.Users.UserFactory;

public class StartHelpers extends StartPage {

    static User sender, receiver;
    static {
        sender = UserFactory.getValidUser(1);
        receiver = UserFactory.getValidUser(2);
    }

    public void createNewLetter() {
        createLetter();
    }

    public void logout() {
        logOut();
    }

    public void openLetterFromSender() {
        openLetter(sender.getName());
    }
}
