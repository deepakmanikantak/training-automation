package com.trainee.phani.selinium.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
    public WebDriver driver() {
        String chromeDriverPath = System.getProperty("user.dir") +  "\\drivers\\chromedriver.exe";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
