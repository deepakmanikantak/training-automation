package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
