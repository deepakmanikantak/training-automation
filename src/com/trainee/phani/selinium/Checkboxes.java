package com.trainee.phani.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * programe to verfiy the user is able to check the radio buttons and check boxes
 *
 * @author phani
 */
public class Checkboxes {
    public static void main(String[] args) {
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        // Perform the rest of the operations
        // this method is used for to maximize the screen
        driver.manage().window().maximize();
        //this method is used for to redirect the paticular website
        driver.get("http://demo.guru99.com/test/radio.html");
        //we are finding the radio button

        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        //clicking on paticular radio button
        radio2.click();
        //finding the check boxess
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        //cselecting the multiple check boxes at a time
        checkbox1.click();
        checkbox3.click();


    }
}
