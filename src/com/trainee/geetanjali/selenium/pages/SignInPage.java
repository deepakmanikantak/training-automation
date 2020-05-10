package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    private WebDriver driver;
    @FindBy(id = "email_create")
    private WebElement accountPage;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement SubmitCreate;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement signin;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement Password;
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement clickOnLogin;

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SignInPage enterMailToCreateAccount() {
        accountPage.sendKeys(getRandomMails() + "@gmail.com");
        return new SignInPage(driver);
    }

    public CreateAccountPage clickOncreateAccount() {
        SubmitCreate.click();
        return new CreateAccountPage(driver);
    }

    public SignInPage enterMailToSignin() {
        signin.sendKeys(GlobalVariables.mailId);
        return new SignInPage(driver);
    }

    public SignInPage enterPasswordToSignin() {
        Password.sendKeys(GlobalVariables.password);
        return new SignInPage(driver);
    }

    public MyAccountPage clickonLogin() {
        clickOnLogin.click();
        return new MyAccountPage(driver);

    }


}
