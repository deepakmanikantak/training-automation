package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.pages.GlobalVariables;
import com.trainee.geetanjali.selenium.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInIntoAccount extends BaseTestNGTest{
    private String username;
    private String password;

    @BeforeMethod
    public void driverInstantiation(){
        System.out.println("Driver has been instantiated");
    }
    @Test
    public void SignInToAccount() {

        HomePage homePage = new HomePage(driver);
        driver.get(GlobalVariables.url);
        homePage.clickOnSignIn().enterMailToSignin(username).enterPasswordToSignin(password).clickonLogin().clickOnHome();
        boolean signinName=homePage.checkSigninName.isDisplayed();
        Assert.assertTrue(homePage.checkSigninName.isDisplayed(),"SignIn verified unsuccessfully");
        System.out.println("Login Successfull");

    }
    @AfterMethod
    public void closingBrowser(){
        System.out.println("Closing the browser");
        driver.quit();
    }
}

