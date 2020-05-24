package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.Pages.AuthenticationPage;
import com.trainee.aizaz.selenium.Pages.HomePage;
import com.trainee.aizaz.selenium.Pages.MyAccount;
import com.trainee.aizaz.selenium.Pages.YourPersonalInformationPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;

public class LogInLogOutUsingExcelDataTest extends BaseTestNg {

    @Test(dataProvider = "logindata")
    public void login(String emailId, String pass) throws InterruptedException {
        //after entering userid and password click on login
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().sendLoginEmailId(emailId).sendLoginPassword(pass).clickOnLogIn();
        //checking whether after login user is able to see my personal information section:
        MyAccount ma = new MyAccount(driver);
        Assert.assertTrue(ma.myPersonalInformationSectionDisplayed(), "My Personal Information Section not displayed");
        //checking whether the user is logged in to the relevent account by comparing email.
        String email = ma.myPersonalInformationSectionClick().getEmailId();
        Assert.assertEquals(emailId, email, "Not logged in relevant account");
        //logging out
        YourPersonalInformationPage y = new YourPersonalInformationPage(driver);
        y.clickOnMyAccountIcon().logout();
        //checking whether is user logged out successfully by seeing sign in section after logout
        AuthenticationPage ap = new AuthenticationPage(driver);
        Assert.assertTrue(ap.signInButtonDisplayed(), "sign button not displayed after logout");
    }

    @DataProvider(name = "logindata", parallel = false)
    public Object[][] loginData() throws IOException {
        Object[][] data = getDataFromExcel("src/com/trainee/aizaz/selenium/Tests/TestDataForSignIn.xlsx");
        return data;
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}