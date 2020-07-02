package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCartConfirmationPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@class='ajax_block_cart_total']")
    private WebElement totalprice;
    @FindBy(xpath = "//div[@class='button-container']//span[@title='Continue shopping']")
    private WebElement continueShopping;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement checkout;

    public AddtoCartConfirmationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String TotalCartPrice() {
        //WebElement totalprice = findElement(GlobalVariables.xpath,"//span[@class='ajax_block_cart_total']");
        explicitWait(driver, totalprice);
        String pricebeforeremove = totalprice.getText();
        return pricebeforeremove;
    }

    public CheckoutPage clickOnCheckout() {


        return new CheckoutPage(driver);
    }

    public CategoryPage continueShopping() {
        //WebElement continueShopping = findElement(GlobalVariables.xpath, "//div[@class='button-container']//span[@title='Continue shopping']");
        explicitWait(driver, continueShopping);
        continueShopping.click();
        return new CategoryPage(driver);
    }

    public OrderConfirmationPage proceedtoCheckOut() {
        explicitWait(driver,checkout);
        javaScriptExecutorToClick(checkout);
        return new OrderConfirmationPage(driver);
    }
}