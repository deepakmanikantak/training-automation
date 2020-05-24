package com.trainee.geetanjali.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;

    public Driver(){

        createDriver();
    }

    public void createDriver(){

        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {

        return driver;
    }

    public void get(String s) {

    }
}

