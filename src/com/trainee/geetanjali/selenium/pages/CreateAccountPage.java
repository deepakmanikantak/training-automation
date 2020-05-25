package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//label[@for='id_gender2']")
    private WebElement RadioButton;
    @FindBy(name = "customer_firstname")
    private WebElement firstName;
    @FindBy(name = "customer_lastname")
    private WebElement lastName;
    @FindBy(id = "passwd")
    private WebElement Password;
    @FindBy(xpath = "//input[@id='address1']")
    private WebElement Address;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement City;
    @FindBy(xpath = "//select[@name='id_state']")
    private WebElement State;
    @FindBy(id = "postcode")
    private WebElement Postcode;
    @FindBy(xpath = "//select[@id='id_country']")
    private WebElement Country;
    @FindBy(xpath = "//input[@name='phone_mobile']")
    private WebElement PhoneNumber;
    @FindBy(xpath = "//input[@name='alias']")
    private WebElement FutureReferenceAddress;
    @FindBy(xpath = "//button[@name='submitAccount']")
    private WebElement register;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CreateAccountPage clickOnRadioButton() {
        RadioButton.click();
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterFirstName() {
        firstName.sendKeys(GlobalVariables.firstname);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterLastName() {
        lastName.sendKeys(GlobalVariables.lastname);
        return new CreateAccountPage(driver);

    }

    public CreateAccountPage enterPassword() {
        Password.sendKeys(GlobalVariables.password);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterAddress() {
        Address.sendKeys(GlobalVariables.address);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterCityName() {
        City.sendKeys(GlobalVariables.city);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage selectState() {
        Select states = new Select(State);
        states.selectByVisibleText(GlobalVariables.state);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterPostCode() {
        Postcode.sendKeys(GlobalVariables.postalcode);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage selectCountry() {
        Select countries = new Select(Country);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterPhoneNumber() {
        PhoneNumber.sendKeys(GlobalVariables.phonenumber);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage enterReferenceAddress() {
        FutureReferenceAddress.sendKeys(GlobalVariables.landmark);
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage clickOnCreateAccount() {
        register.click();
        return new CreateAccountPage(driver);
    }
}

