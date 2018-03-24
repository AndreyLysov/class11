package com.company.Pages;

import com.company.Driver.DriverFactory;
import com.company.Driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static com.company.Common.Constants.BASE_URL;

public class BasePage {
    protected static MyDriver driver = MyDriver.getMyDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 10);
    protected Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}