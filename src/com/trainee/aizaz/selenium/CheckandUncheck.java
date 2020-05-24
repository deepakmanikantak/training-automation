package com.trainee.aizaz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
/**
 * the purpose of the script is to see
 * whether the user is able to check and
 * uncheck the checkbox
 * @author aizaz
 */
public class CheckandUncheck {
    public static void main(String[] args) {
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        //check the checkbox
        driver.findElement(By.id("vfb-6-0")).click();
        //uncheck the checkbox
        driver.findElement(By.id("vfb-6-0")).click();
        driver.quit();
    }
}
