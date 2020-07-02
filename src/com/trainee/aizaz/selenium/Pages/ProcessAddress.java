package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcessAddress extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement addressCheckout;

    public ProcessAddress(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public ShippingCheckoutPage AddressCheckout(){
        addressCheckout.click();
        return new ShippingCheckoutPage(driver);
    }
}