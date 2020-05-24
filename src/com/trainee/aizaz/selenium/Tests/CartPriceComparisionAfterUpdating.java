package com.trainee.aizaz.selenium.Tests;

import com.trainee.aizaz.selenium.Pages.CartPage;
import com.trainee.aizaz.selenium.Pages.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * purpose of this class is to test whether the price is reduced after the removal of any item
 *PROCESS:::
 * homepage---->Womens--->Tshirts---->category section---->addtocart--->addtocartmodel
 * ----->click on continue shopping---->categorysection----click on women
 * ---->addtocartanotheritem---->selectcartsection----reterivingcurrentprice
 * ----removingoneitem-----reterivinglatestprice--->comparingbothprices.
 *
 */

public class CartPriceComparisionAfterUpdating extends BaseTest {
    public static void main(String[] args) {
        CartPriceComparisionAfterUpdating s = new CartPriceComparisionAfterUpdating();
        //calling driver from BaseTest
        WebDriver driver = s.driverManager();
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
        driver.quit();
    }
}