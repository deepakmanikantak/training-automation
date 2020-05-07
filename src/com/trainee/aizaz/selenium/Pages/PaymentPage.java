package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@class='cheque']")
    private WebElement payByCheque;
    public PaymentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public OrderSummaryPage payByCheque(){
        payByCheque.click();
        return new OrderSummaryPage(driver);
    }
}
