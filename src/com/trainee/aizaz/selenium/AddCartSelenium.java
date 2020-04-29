package com.trainee.aizaz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartSelenium extends Thread {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul[@id='homefeatured']//a[@title='Add to cart']")).click();
      //  driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();

    //  driver.findElement(By.className("sf-with-ul")).click();
      //  driver.findElement(By.xpath("//a[@title='T-shirts'])")).click();

    }}
