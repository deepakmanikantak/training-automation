package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement orderConfirmButton;
    public OrderConfirmationPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void iConfirmOrder(){
        orderConfirmButton.click();
    }
}
