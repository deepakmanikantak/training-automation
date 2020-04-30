package com.trainee.aizaz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * the purpose of this script is to check
 * whether radio button is selected even after
 * selecting next radio button
 * @author aizaz
 */

public class CheckRadioButton {
    public static void main(String[] args) {
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        //first clicking radio button 1
        radio1.click();
        //clicking radio button-2
        radio2.click();
        /**
         * checking whether radio button-1 is selected
         * even after selecting radio button-2
         */
        boolean radio1Selected = radio1.isSelected();
        if (radio1Selected == false) {
            System.out.println("radio button 1 is not selected \n Test passed");
        } else {
            System.out.println("radio-1 is selected even after clicking radio button 2 \n Test failed");
        }
    }
}