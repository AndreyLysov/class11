package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LoginPage extends BasePage{

    @FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//p/input[@type='submit']")
	private WebElement btnLogin;

	@FindBy(name = "domn")
	private WebElement domn;


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
	    logger.info("set name " + name);
        driver.jsSetValue(inputLogin, name);
        logger.info("set password " + password);
        driver.jsSetValue(inputPassword, password);
//        Select domain = new Select(domn);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        for (char c : "Ket".toCharArray()) {
            robot.keyRelease(c);
        }

        clickLogin();
    }
}
