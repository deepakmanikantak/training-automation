package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTestNGTest {
    WebDriver driver;
    @BeforeMethod
    public void driverInitiation(){
        Driver d= new Driver();
        d.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        d.getDriver().manage().window().maximize();
        d.get("http://automationpractice.com/index.php");
        driver =d.getDriver();
    }


}
