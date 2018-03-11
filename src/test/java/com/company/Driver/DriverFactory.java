package com.company.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static com.company.Common.Constants.BASE_URL;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("chrome".equals(property)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer2.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        return driver;
    }
}
