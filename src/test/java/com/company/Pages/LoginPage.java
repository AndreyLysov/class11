package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//p/input[@type='submit']")
	private WebElement btnLogin;

	public void enterLogin (String name) {
	    inputLogin.sendKeys(name);
    }

    public void enterPassword (String password) {
	    inputPassword.sendKeys(password);
    }

    public void clickLogin () {
	    btnLogin.click();
    }

    public void login (String name, String password) {
	    enterLogin(name);
	    enterPassword(password);
	    clickLogin();
    }
}
