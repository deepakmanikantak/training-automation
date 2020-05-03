package com.trainee.aizaz.selenium.Tests;

import com.trainee.aizaz.selenium.Pages.CartPage;
import com.trainee.aizaz.selenium.Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class Script extends BaseTest {
    public static void main(String[] args) {
        Script s = new Script();
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
        cartPage.removeItem();
        /**
         * Rechecking the cart price
         */
        String cartPriceAfter = cartPage.cartPrice();
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
}
