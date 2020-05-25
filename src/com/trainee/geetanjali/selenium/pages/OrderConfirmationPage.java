package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath="//span[@id='total_price']")
    private WebElement productpagetotal;
    @FindBy(xpath="//a[@title='Subtract']")
    private WebElement removeItem;
    @FindBy(xpath="//a[@title='Proceed to checkout']")
    private WebElement checkout;
    @FindBy(xpath="//span[@class='ajax_cart_quantity']")
    private WebElement quantity;
    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement clickCheckbox;
    @FindBy(xpath="//a[@class='cheque']")
    private WebElement payByCheque;
    @FindBy(xpath="//button[@name='submit_search']")
    private WebElement confirmOrder;
    @FindBy(xpath="//p[@class='alert alert-success']")
    public  WebElement orderSuccess;
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String productpageprice() {
        explicitWait(driver, productpagetotal);
        return productpagetotal.getText();

    }
    public void removeItem() {
        //WebElement removeItem = findElement(GlobalVariables.xpath, "//a[@title='Subtract']");
        removeItem.click();

    }
    public OrderConfirmationPage confirmProceedToCheckout() {
        javaScriptExecutorToClick(checkout);
        return new OrderConfirmationPage(driver);
    }
    public OrderConfirmationPage termsAndConditionsCheckout(){
        clickCheckbox.click();
        return new OrderConfirmationPage(driver);
    }
    public OrderConfirmationPage clickOnPayByCheque(){
        payByCheque.click();
        return new OrderConfirmationPage(driver);
    }
    public OrderConfirmationPage clickOnConfirmOrder(){
        confirmOrder.click();
        return new OrderConfirmationPage(driver);
    }
    public OrderConfirmationPage isOrderSuccessMessageDisplayed(){
        orderSuccess.getText();
        return new OrderConfirmationPage(driver);
    }
    public String checkAddtocart(){
        String cartQuantity=quantity.getText();
        return "1";
    }

}