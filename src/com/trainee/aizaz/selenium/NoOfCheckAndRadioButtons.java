package com.trainee.aizaz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * the purpose of this class is to count number
 * of checkbox and radio buttons
 */
public class NoOfCheckAndRadioButtons {
    public static void main(String[] args) {
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        // we are using finElements to get no of elements of checkbox in the list
        List noOfCheckBox = driver.findElements(By.xpath("//*[contains(@id,'vfb-6')]"));
        //here are we are using size() method to now how many checkboxes are available
        System.out.println("No of checkboxes available are: " + noOfCheckBox.size());
        // we are using finElements to get no of elements of radio buttons in the list
        List noOfRadioButton = driver.findElements(By.xpath("//*[contains(@id,'vfb-7')]"));
        //here are we are using size() method to now how many radio butons are available
        System.out.println("No of radio buttons available are: " + noOfRadioButton.size());
    }
}
