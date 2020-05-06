package com.trainee.phani.selinium.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestNG  {
    WebDriver driver;

    @BeforeMethod

    public void driverinitiation() {
       Basetest b=new Basetest();
       driver=b.driver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       driver.get("http://automationpractice.com/index.php");



    }
}
