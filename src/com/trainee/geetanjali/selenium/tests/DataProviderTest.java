package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderTest extends BaseTestNGTest {

    @Test(dataProvider = "signin")
    public void login(String username, String password) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().enterMailToSignin(username).enterPasswordToSignin(password).clickonLogin();
        MyAccountPage accountPage=new MyAccountPage(driver);
        String mailId=accountPage. clickOnMyPersonalInformation().verifyEmailId();
        Assert.assertEquals(username,mailId,"Not signedIn into the correct account");
        PersonalInformationPage pg=new PersonalInformationPage(driver);
        pg.clickOnMyAccount().verifySignOut();
        SignInPage sg=new SignInPage(driver);
        Assert.assertTrue(sg.verifyIsSignInDisplayed(),"you are not logged out");
    }

    @DataProvider(name = "signin", parallel = false)
    public Object[][] signInData() throws IOException {
        Object[][] data = getSignInDataFromExcel("src/com/trainee/geetanjali/selenium/tests/Excel2.xlsx");
return data;
    }
    @AfterMethod
    public void closingBrowser() {
        System.out.println("closing the browser");
        driver.quit();

    }
}


