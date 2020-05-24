package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.pages.CreateAccountPage;
import com.trainee.geetanjali.selenium.pages.GlobalVariables;
import com.trainee.geetanjali.selenium.pages.HomePage;
import com.trainee.geetanjali.selenium.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAnAccount extends BaseTestNGTest {
    @BeforeMethod
    public void driverInstance(){
        System.out.println("Instantiating the driver");
    }
    @Test
    public void createAccount() {
        HomePage homePage = new HomePage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        driver.get(GlobalVariables.url);
        homePage.clickOnSignIn().enterMailToCreateAccount().clickOncreateAccount().clickOnRadioButton().enterFirstName().enterLastName().enterPassword().enterAddress().enterCityName().selectState()
                .enterPostCode().selectCountry().enterPhoneNUmber().enterReferenceAddress().clickOnCreateAccount();
        
        MyAccountPage myAccountpage=new MyAccountPage(driver);
        Assert.assertTrue(myAccountpage.homeicon.isDisplayed(),"home icon is not displayed");
        System.out.println("Registered successfully");
        }

    @AfterMethod
    public void closingBrowser(){
        System.out.println("closing the browser");
       driver.quit();

    }
}
