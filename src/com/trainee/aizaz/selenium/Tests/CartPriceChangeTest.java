package com.trainee.aizaz.selenium.Tests;

import com.trainee.aizaz.selenium.Pages.CartPage;
import com.trainee.aizaz.selenium.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPriceChangeTest extends BaseTestNg{
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execute:Before suite");
    }

    @Test
    public void a() {
        CartPriceComparisionAfterUpdating s = new CartPriceComparisionAfterUpdating();
        //creating object for HomePage and sending driver as parameter
        HomePage homePage = new HomePage(driver);
        /**
         * This is the process in which we are performing actions then finally
         * Storing cart price..
         */
        String cartPriceBefore = homePage.clickOnTshirts().addProductToCart().continueShopping().addProductToCart()
                .continueShopping().viewCart().cartPrice();
        System.out.println("cart price before removal of item" + cartPriceBefore);
        /**
         * creating cartpage object to perform action in cart section
         */
        CartPage cartPage = new CartPage(driver);
        //removing item from cart
        //   cartPage.removeItem();
        /**
         * Rechecking the cart price
         */
        String cartPriceAfter = cartPage.removeItem().cartPrice();
        System.out.println("cart price after removal of item" + cartPriceAfter);
        /**
         * comparing cart price before removal of item with price after removal item:
         */
        if (cartPriceBefore.equalsIgnoreCase(cartPriceAfter)) {
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execute:After suite");
        driver.quit();
    }
}