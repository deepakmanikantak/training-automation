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


    public AddedToCartModel(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getCartPrice() {
      //  WebElement price = findElement("//span[@class='ajax_block_cart_total']", GlobalVariables.xpath);
        explicitWait(driver, price);
        String cartPrice = price.getText();
        return cartPrice;
    }

    public CheckoutPage clickOnCheckout() {
        return new CheckoutPage(driver);
    }

    public CategoryPage continueShopping() {
      //  WebElement shopping = findElement(GlobalVariables.xpath, "//div[@class='button-container']//span[@title='Continue shopping']");
        explicitWait(driver,shopping);
        shopping.click();
        return new CategoryPage(driver);

    }
}