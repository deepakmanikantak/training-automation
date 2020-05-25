package com.trainee.geetanjali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyingXpathForLinks {
    public static void main(String args[]) {
        //getting the directory of chromedriver by using getProperty method
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();

        //implicit waits are used as it takes time to load the page so by using implicit waits it will wait until the specified time through out the driver instance
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //here we are maximizing the window
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("oorwin");

        Actions action = new Actions(driver);

        action.sendKeys(Keys.ENTER).build().perform();
        // driver.findElement(By.xpath("")).click();
        List<WebElement> links = driver.findElements(By.tagName("h3"));
        for (int i = 0; i<links.size();i++) {
            System.out.println(links.get(i).getText());
        }
        for(int i=0;i<links.size();i++){
            System.out.println("First link is:"+links.get(i).getText());
            break;
        }
        driver.findElement(By.xpath("(//h3)[1]")).click();

         driver.quit();
    }

}

