package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends BasePage{
    private WebDriver driver;
    @FindBy(xpath="//input[@id='email']")
    private WebElement emailid;
@FindBy(xpath="//div[@class='breadcrumb clearfix']//a[2]")
private WebElement myAccount;
    public PersonalInformationPage (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public String verifyEmailId(){
        return emailid.getAttribute("value");
    }
    public MyAccountPage clickOnMyAccount(){
        myAccount.click();
        return new MyAccountPage(driver);
    }
}
