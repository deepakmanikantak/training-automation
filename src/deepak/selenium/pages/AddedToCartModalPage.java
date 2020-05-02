package deepak.selenium.pages;

import org.openqa.selenium.WebDriver;

public class AddedToCartModalPage extends BasePage {


    private WebDriver driver;

    public AddedToCartModalPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public CheckoutPage clickOnCheckout(){
        return new CheckoutPage(driver);
    }

    public String getCartTotalOnConfirmationModal(){
        return "";
    }
}
