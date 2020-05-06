package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.Pages.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * this class contains complete test of the e-commerece website
 * ---------flow----------
 * signin---->logout---->login--->addtocart---->proceedtocheckout--->addresscheckout--->shippingcheckout
 * --->paymentoptions---->confirmorder.
 */

public class SignInLoginAddtoCartTest extends BaseTest {
    public static void main(String[] args) {
        SignInLoginAddtoCartTest s = new SignInLoginAddtoCartTest();
        WebDriver driver = s.driverManager();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().emailForRegistration().accountDetailsforRegistration().logout().login().returnHome()
                .clickOnTshirts().addProductToCart().clickOnInitialCheckout().checkout2().AddressCheckout()
                .shippingCheckout().payByCheque().iConfirmOrder();
        driver.quit();

    }
}
