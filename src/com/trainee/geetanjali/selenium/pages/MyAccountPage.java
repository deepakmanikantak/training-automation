package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath="//span[@class='navigation_page']")
    private WebElement myAccount;
    @FindBy(xpath="//a[@title='Home']")
    private WebElement home;
    @FindBy(xpath="//span[text()='Anjali Guda']")
    public WebElement homeicon;
    @FindBy(xpath="//a[@title='Information']")
    private WebElement personalinformation;
    @FindBy(xpath="//a[@title='Log me out']")
    private WebElement signout;
    public MyAccountPage (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public boolean isHomeIconDisplayed(){
        homeicon.isDisplayed();
        return true;
    }
    public HomePage clickOnHome(){
        javaScriptExecutorToClick(home);
        return new HomePage(driver);
    }
    public PersonalInformationPage clickOnMyPersonalInformation(){
        personalinformation.click();
        return new PersonalInformationPage(driver);
    }
    public SignInPage verifySignOut(){
        signout.click();
        return new SignInPage(driver);
    }

}

