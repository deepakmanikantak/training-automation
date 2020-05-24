package com.trainee.phani.life360.Tesst;

import com.trainee.phani.selinium.Tests.Basetest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BasetestNg {

    WebDriver driver;
    @BeforeMethod
    public void driverinitiation() {
        Basetest b = new Basetest();
        driver = b.driver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.life360.com");
    }
}
