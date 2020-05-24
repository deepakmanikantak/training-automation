package com.trainee.phani.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * program to click the non selected radio button and check the previous one is unselected
 *
 * @author phani
 */
public class Radiobuttons {
    public static void main(String[] args) {
        // Below property gives the path of the project location
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        //page will take some time to load so we take implicit waits here
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Perform the rest of the operations
        //this method is used for to maximize the window
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
        radio3.click();
        if (radio2.isSelected()) {
            System.out.println("still previous one selcted and not updated");
        } else {
            System.out.println("latest one is selected");
        }
    }

}
