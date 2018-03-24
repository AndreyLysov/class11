package com.company.Steps;

import com.company.Pages.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

public class LoginSteps extends BaseStep {

    App app = new App();

    @Given("^i\\.ua is opened$")
    public void i_ua_is_opened() throws Throwable {
        System.out.println("hi");
    }

    @When("^log in with valid credentials$")
    public void log_in_with_valid_credentials() throws Throwable {
        app.login.loginValidUser();
    }

    @Then("^user's email is displayed$")
    public void user_s_email_is_displayed() throws Throwable {
        assertEquals("User did not log in", user.getEmail(), app.start.getEmail());
    }

}


/*
    @Test
    public void testLogin() {
        app.login.login(user.getEmail(), user.getPassword());
        Assert.assertEquals(user.getEmail(), app.start.getEmail(), "User did not log in");
    }
*/

/*
    @Test
    public void testSendingEmail() {
//        app.login.loginValidUser();
        app.start.createNewLetter();
        app.compose.composeAndSendValidLetter();
        app.start.logout();
        app.login.loginAsReceiver();
        app.start.openLetterFromSender();
        Assert.assertEquals(app.letter.getLetter(), app.compose.letter, "com.company.Letters are not equal");
    }*/
