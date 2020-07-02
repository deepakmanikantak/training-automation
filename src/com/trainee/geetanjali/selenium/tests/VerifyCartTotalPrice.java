package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.pages.HomePage;
import com.trainee.geetanjali.selenium.pages.OrderConfirmationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyCartTotalPrice extends BaseTestNGTest {
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Before test execution");

        }
        
    @Test
            public void test() {
        HomePage homePage = new HomePage(driver);
        String PriceBeforeRemove = homePage.clickOnTshirts().addProductToCart().continueShopping().addProductToCart()
                .continueShopping().addProductToCart().continueShopping().addProductToCart().continueShopping().clickOnCart().productpageprice();
        System.out.println("cart price before removal of item" + PriceBeforeRemove);
        OrderConfirmationPage productPage = new OrderConfirmationPage(driver);
        productPage.removeItem();

        String PriceAfterRemove = productPage.productpageprice();
        System.out.println("cart price after removal of item" + PriceAfterRemove);

        if (PriceBeforeRemove.equalsIgnoreCase(PriceAfterRemove)) {
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }
    @AfterMethod
    public void closingbrowser() {
            System.out.println("After test execution:");
        driver.quit();
    }
}//



