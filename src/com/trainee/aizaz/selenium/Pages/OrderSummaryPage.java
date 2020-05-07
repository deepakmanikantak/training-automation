package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement orderConfirmButton;
    public OrderSummaryPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public ConfirmationPage iConfirmOrder(){
        orderConfirmButton.click();
        return new ConfirmationPage(driver);
    }
}
