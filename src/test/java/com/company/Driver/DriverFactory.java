package com.company.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.company.Common.Constants.BASE_URL;

public class DriverFactory {
    public static WebDriver driver;
    public static DesiredCapabilities caps;

    public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("chrome".equals(property)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("remote".equals(property)) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "65.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.local", "true");
            caps.setCapability("browserstack.localIdentifier", "Test123");

            try {
                driver = new RemoteWebDriver(
                        new URL("https://andreylysov1:c4VJioUycqpABm9tFdZS@hub-cloud.browserstack.com/wd/hub"),
                        DesiredCapabilities.chrome()
                );
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(BASE_URL);

        return driver;
    }
}