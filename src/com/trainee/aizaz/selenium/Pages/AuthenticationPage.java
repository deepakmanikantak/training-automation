package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage {

    private WebDriver driver;
    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement email;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement login;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement authenticationHeading;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CreateAccount emailForRegistration(String emailId) {
        visibilityOfElement(email);
        email.sendKeys(emailId);
        createAccountButton.click();
        return new CreateAccount(driver);
    }

    public AuthenticationPage sendLoginEmailId(String emailId) {
        loginEmail.sendKeys(emailId);
        return new AuthenticationPage(driver);
    }

    public AuthenticationPage sendLoginPassword(String password) {
        loginPassword.sendKeys(password);
        return new AuthenticationPage(driver);
    }

    public MyAccount clickOnLogIn() {
        login.click();
        return new MyAccount(driver);
    }

    public boolean signInButtonDisplayed() {
        return login.isDisplayed();
    }
}