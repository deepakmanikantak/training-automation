package com.trainee.geetanjali.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Purpose of this class to verify the functionalities of radio buttons and checkboxes and to find number of checkboxes and radio buttons present by taking a demo site
 *
 * @author geetanjali
 */
public class InspectCheckboxesAndRadiobuttons {
    public static void main(String args[]) {
        //getting the directory of chromedriver by using getProperty method
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();

        //implicit waits are used as it takes time to load the page so by using implicit waits it will wait until the specified time through out the driver instance
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //here we are maximizing the window
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        //In order to get the list of radio buttons I have used findElements method instead of findElement
        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
        //size() method is used in order to get the number of radiobuttons present
        System.out.println("Number of RadioButtons=" + radiobuttons.size());
        //In order to get the list of checkboxes I have used findElements method instead of findElement
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //size() method is used in order to get the number of checkboxes present
        System.out.println("Number of checkboxes=" + checkboxes.size());
        // clicking on the first radiobutton
        WebElement radio1click = driver.findElement(By.id("vfb-7-1"));
        radio1click.click();
        //clicking on second radiobutton
        WebElement radio2click = driver.findElement(By.id("vfb-7-2"));
        radio2click.click();
        //verifying whether the unselected radio button is selected or not and slected button is unselected or not
        if (radio1click.isSelected()) {
            System.out.println("radio1 button is selected : Fail");
        } else {
            System.out.println("radio1 button is not selected: Pass");
        }
        //checking whether we can check and uncheck the checkboxes
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        checkbox1.click();
        //checking for the condition whether checkbox is selected or not
        if (checkbox1.isSelected()) {
            System.out.println("checked the checkbox1: Pass");
        } else {
            System.out.println("Not checked the checkbox1:Fail");
        }
        checkbox1.click();
        //checking for the codition whether the checkox is unchecked or not
        if (checkbox1.isSelected()) {
            System.out.println("Notunchecked the checkbox1:Fail");
        } else {
            System.out.println("Unchecked the checkbox1:Pass");
        }
        driver.quit();
    }
}

