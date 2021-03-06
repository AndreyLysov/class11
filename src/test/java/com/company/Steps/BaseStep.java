package com.company.Steps;

import com.company.Pages.App;
import com.company.Users.User;
import com.company.Users.UserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseStep {

    protected WebDriver driver;
    protected User user = UserFactory.getValidUser(1);
    protected static App app = new App();
    protected User receiver = UserFactory.getValidUser(2);

    @AfterSuite
    public void tearDownSuite() throws Exception {
        app.commonHelper.stopApp();
    }
}
