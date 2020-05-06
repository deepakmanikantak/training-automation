package com.trainee.aizaz.selenium.Pages;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath ="//div[@id='HOOK_SHOPPING_CART']/..//a[@title='Proceed to checkout']" )
    private WebElement finalCheckout;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public ProcessAddress checkout2(){
        finalCheckout.click();
        return new ProcessAddress(driver);

    }
}

////a[@title='Proceed to checkout']
////div[@class='button-container']//a[@title='Proceed to checkout']
////div[@id='HOOK_SHOPPING_CART']/..//a[@title='Proceed to checkout']