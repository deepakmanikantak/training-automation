package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.Pages.AuthenticationPage;
import com.trainee.aizaz.selenium.Pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * this class contains complete test of the e-commerece website
 * ---------flow----------
 * signin---->logout---->login--->addtocart---->proceedtocheckout--->addresscheckout--->shippingcheckout
 * --->paymentoptions---->confirmorder.
 */
public class SignInLoginAddtoCartTestng extends BaseTestNg {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execute:Before suite");
    }

    @Test(priority=1)
    public void signIn(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().emailForRegistration().accountDetailsforRegistration().logout();
    }
    @Test(priority =2)
    public void loginandCheckout(){
        HomePage homePage=new HomePage(driver);
        homePage.clickOnSignIn().login().returnHome().clickOnTshirts().addProductToCart().clickOnInitialCheckout()
                .checkout2().AddressCheckout().shippingCheckout().payByCheque().iConfirmOrder();
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("Execute:After suite");
        driver.quit();
    }
}
