package com.trainee.aizaz.selenium.Tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowserTest extends BaseTestNg {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execute:Before suite");
    }

    @Test
    public void a() {
        driver.get("http://automationpractice.com/index.php");
        System.out.println("Test-sucess");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execute:After suite");
        driver.quit();
    }
}