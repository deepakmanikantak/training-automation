package com.trainee.phani.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * program to count no of checkboxes and radio buttons that are avaliable in an webpage
 *
 * @author phani
 */
public class Countradiosnadcheckboxes {
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
        //we use findelements to get the list of elments for radiobuttons
        List countofradio = driver.findElements(By.xpath("//input[@type='radio']"));
        //we use find elements to get the list of elements for check boxes
        List checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int totalcountofradiobuttons = countofradio.size();
        int totalcountofcheckboxes = checkboxes.size();
        //printing the total count for radio buttons and checkboxes which are avaliable in the webpage
        System.out.println("total count of radio buttons are " + totalcountofradiobuttons);
        System.out.println("total count for check boxes are " + totalcountofcheckboxes);
    }
}