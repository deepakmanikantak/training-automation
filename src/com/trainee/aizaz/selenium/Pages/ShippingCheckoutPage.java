package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingCheckoutPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement shippingCheckout;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement agreeTerms;
    public ShippingCheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public PaymentPage shippingCheckout(){
        agreeTerms.click();
        shippingCheckout.click();
        return new PaymentPage(driver);
    }
}