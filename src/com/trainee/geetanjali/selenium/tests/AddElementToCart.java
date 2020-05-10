package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.pages.GlobalVariables;
import com.trainee.geetanjali.selenium.pages.HomePage;
import com.trainee.geetanjali.selenium.pages.OrderConfirmationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddElementToCart extends BaseTestNGTest {
    String expectedQuantity = "1";

    @BeforeMethod
    public void driverInstantiation() {
        System.out.println("Driver has been instantiated");
    }

    @Test
    public void addProduct() {

        HomePage homePage = new HomePage(driver);
        driver.get(GlobalVariables.url);
        homePage.clickOnTshirts().addProductToCart().proceedtoCheckOut().confirmProceedToCheckout().confirmProceedToCheckout().
                termsAndConditionsCheckout().confirmProceedToCheckout().clickOnConfirmOrder();
        System.out.println("Element added successfully");
        OrderConfirmationPage confirmationPage = new OrderConfirmationPage(driver);
        if (confirmationPage.orderSuccess.isDisplayed()) {
            System.out.println("Order placed successfully");
        } else {
            System.out.println("Order is not placed");
        }
    }

    @AfterMethod
    public void closingBrowser() {
        System.out.println("Closing the browser");
        // driver.quit();
    }
}
