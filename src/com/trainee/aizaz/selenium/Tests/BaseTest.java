package com.trainee.aizaz.selenium.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    /**
     * this class is used to instantiate web driver which we
     * will be using in our test classes
     * @return
     */
    public WebDriver driverManager() {
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
