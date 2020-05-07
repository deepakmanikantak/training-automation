package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement orderSucessMessage;
    public ConfirmationPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean orderSucesssMessage(){
        return orderSucessMessage.isDisplayed();
    }
}
