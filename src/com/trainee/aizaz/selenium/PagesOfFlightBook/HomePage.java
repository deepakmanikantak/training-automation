package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebDriver driver;

    @FindBy(linkText = "REGISTER")
    private WebElement registerOption;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement login;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegsitrationPage clickOnRegister() {
        registerOption.click();
        return new RegsitrationPage(driver);

    }

    public HomePage enterUserName(String username) {
        userName.sendKeys(username);
        return new HomePage(driver);
    }

    public HomePage enterPassword(String pass) {
        password.sendKeys(pass);
        return new HomePage(driver);
    }

    public FlightFinderPage login() {
        login.click();
        return new FlightFinderPage(driver);
    }

}