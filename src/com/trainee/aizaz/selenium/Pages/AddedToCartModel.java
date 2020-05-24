package com.trainee.aizaz.selenium.Pages;

import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedToCartModel extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@class='ajax_block_cart_total']")
    private WebElement price;
    @FindBy(xpath = "//div[@class='button-container']//span[@title='Continue shopping']")
    private WebElement shopping;
    @FindBy(xpath = "//div[@class='button-container']//a[@title='Proceed to checkout']")
    private WebElement initialCheckout;

    public AddedToCartModel(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getCartPrice() {
      //  WebElement price = findElement("//span[@class='ajax_block_cart_total']", GlobalVariables.xpath);
        visibilityOfElement( price);
        String cartPrice = price.getText();
        return cartPrice;
    }

    public CheckoutPage clickOnInitialCheckout() {
        initialCheckout.click();
        return new CheckoutPage(driver);
    }

    public CategoryPage continueShopping() {
      //  WebElement shopping = findElement(GlobalVariables.xpath, "//div[@class='button-container']//span[@title='Continue shopping']");
        visibilityOfElement(shopping);
        shopping.click();
        return new CategoryPage(driver);

    }
}