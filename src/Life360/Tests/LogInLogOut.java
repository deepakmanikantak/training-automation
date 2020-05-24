package Life360.Tests;
import Life360.Pages.ApplicationHomePage;
import Life360.Pages.HomePage;
import Life360.Pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The purpose of this test is to see whether the user is able to login and login out successfully or not.
 */

public class LogInLogOut extends BaseTest {

    @Test
    public void LogInAndLogOut(){
        HomePage hp=new HomePage(driver);
        hp.clickOnSignIn().enterMobileNo("2085552761").enterPassword("helloworld").clickOnLogin();
        ApplicationHomePage ap=new ApplicationHomePage(driver);
        /**
         * after registering we are checking whether the user able to see myAccountDropDown Option
         * after logging in to confirm whether the user is logged in successfully or not.
         */
        Assert.assertTrue(ap.myAccountDropDownSymbolIsDisplayed(),"my account drop down symbol not displayed");
        ap.clickOnAccountOption().clickOnSignOut().confirmSignOut();
        SignIn si=new SignIn(driver);
        /**
         * After sign out we are checking is user able to see sign in option to confirm
         * whether user is siggned out successfully or not
         */
        Assert.assertTrue(si.signInButtonIsVisible(),"sign in button not visible");
    }
}