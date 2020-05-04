package deepak.selenium.tests;

import deepak.selenium.pages.AddedToCartModalPage;
import deepak.selenium.pages.CategoryPage;
import deepak.selenium.pages.CheckoutPage;
import deepak.selenium.pages.HomePage;
import org.openqa.selenium.WebDriver;


/**
 * 1. Navigate to HomePage
 * 2. Verify PageTitle
 * 2. Click on T-shirts on the Top Menu
 * 3. On Category Page, Click on Add to Cart On a product
 * 4. On Added to cart modal page click on checkout
 * 5. Verify cart total in Added to cart modal equals checkoutpage
 *
 * @author deepak
 */
public class VerifyCartTotalInCheckoutTest extends BaseTest{


    private static WebDriver driver;

    public static void main(String[] args) {

        String expectedPageTitle = "My Store";

        HomePage homePage = new HomePage(driver);

        //
        if (homePage.getPageTitle().equalsIgnoreCase(expectedPageTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        AddedToCartModalPage addedToCartModalPage = homePage
                .clickOnWomens()
                .addProductToCart();

        String expectedTotal = addedToCartModalPage.getCartTotalOnConfirmationModal();
        CheckoutPage checkoutPage = addedToCartModalPage.clickOnCheckout();
        String actualTotal = checkoutPage.getCartTotal();

        if (expectedTotal.equalsIgnoreCase(actualTotal)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
