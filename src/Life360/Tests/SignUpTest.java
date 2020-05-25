package Life360.Tests;

import Life360.Pages.ApplicationHomePage;
import Life360.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * The purpose of this test class is to sign up for life360 application
 *
 */
public class SignUpTest extends BaseTest {
    @BeforeMethod
    public void driverInstance() {
        System.out.println("Instantiating the driver");
    }

    @Test
    public void createAccount() {
        HomePage page = new HomePage(driver);
        page.clickOnSignIn().clickOnRegisterToday().enterFirstName("hello").enterLastName("world").
                enterValidEmail("geetanjaliguda2008@gmail.com").selectCountry("United States").enterPhoneNumber("2085552761").enterPassword("helloworld").
                enterConfirmPassword("helloworld").clickOnContinue();
        ApplicationHomePage ap = new ApplicationHomePage(driver);
        Assert.assertTrue(ap.myAccountDropDownSymbolIsDisplayed(), "my account drop down symbol not displayed");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
