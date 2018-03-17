package com.company.Pages;

import com.company.Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static com.company.Common.Constants.BASE_URL;

public class BasePage {
    protected static WebDriver driver;

    static {
        try {
            driver = DriverFactory.getDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    protected static WebDriverWait wait = new WebDriverWait(driver, 10);

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}