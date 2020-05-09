package com.trainee.aizaz.selenium.Tests;

import com.trainee.aizaz.selenium.Pages.*;
import org.testng.Assert;
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

    /**
     * This test contains registration of new user and then after registering performing logout
     * :::checks:::
     * 1.)After registering checking whether MY PERSONAL INFORMATION section is visible.
     * 2.)After logout checking whether sign in button is visible
     */
    @Test(priority = 1)
    public void registrationAndLogout() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().emailForRegistration("helloworld20@gmail.com").clickOnGender("male")
                .setFirstName("aizaz").setLastName("ahmed").setPassword("hello").setAddress("james road")
                .setCityName("chicago").clickOnCountry().clickOnState(5).setPostcode("00000").setMobileNo("2085557704")
                .clickOnRegister();
        //checking whether after registration is user able to see My personal Information section:
        MyAccount ma = new MyAccount(driver);
        Assert.assertTrue(ma.myPersonalInformationSectionDisplayed(), "My Personal Information Section not displayed");
        ma.logout();
        //checking whether after logout is user able to see sign in section:
        AuthenticationPage ap = new AuthenticationPage(driver);
        Assert.assertTrue(ap.signInButtonDisplayed(), "sign button not displayed after logout");

    }

    /**
     * This test contains logging in with the existing id and placing order.
     * :::checks:::
     * 1.)After login checking whether MY PERSONAL INFORMATION section is visible.
     * 2.)After placing order whether user is able to see order confirmation message.
     */
    @Test(priority = 2)
    public void loginandCheckout() {
        //after entering userid and password click on login
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn().sendLoginEmailId("helloworld20@gmail.com").sendLoginPassword("hello").clickOnLogIn();
        //checking whether after login user is able to see my personal information section:
        MyAccount ma = new MyAccount(driver);
        Assert.assertTrue(ma.myPersonalInformationSectionDisplayed(), "My Personal Information Section not displayed");
        //after login returning on homepage-->adding item-->proceeding to all checkouts--->finally confirming order
        ma.returnHomePage().clickOnTshirts().addProductToCart().clickOnInitialCheckout()
                .checkoutAtCheckoutPage().AddressCheckout().shippingCheckout().payByCheque().iConfirmOrder();
        //checking whether after placing order the confirmation message is displayed or not:
        ConfirmationPage cp = new ConfirmationPage(driver);
        Assert.assertTrue(cp.orderConfirmationMessage(), "order success message not displayed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execute:After suite");
        driver.quit();
    }
}