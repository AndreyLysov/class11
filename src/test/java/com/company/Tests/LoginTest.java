package com.company.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        app.login.login(user.getEmail(), user.getPassword());
        Assert.assertEquals(user.getEmail(), app.start.getEmail(), "User did not log in");
    }

    @Test
    public void testSendingEmail() {
//        app.login.loginValidUser();
        app.start.createNewLetter();
        app.compose.composeAndSendValidLetter();
        app.start.logout();
        app.login.loginAsReceiver();
        app.start.openLetterFromSender();
        Assert.assertEquals(app.letter.getLetter(), app.compose.letter, "com.company.Letters are not equal");
    }
}