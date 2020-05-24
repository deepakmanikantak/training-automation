package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegsitrationPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement emailId;

    @FindBy(xpath = "//input [@name='address1']")
    private WebElement address;

    @FindBy(xpath = "//input [@name='city']")
    private WebElement city;

    @FindBy(xpath = "//input [@name='state']")
    private WebElement state;

    @FindBy(xpath = "//input [@name='postalCode']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passWord;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='register']")
    private WebElement register;

    RegsitrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegsitrationPage setFirstName(String firstname) {
        firstName.sendKeys(firstname);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setLastName(String lastname) {
        lastName.sendKeys(lastname);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setPhoneNo(String mobileNo) {
        phone.sendKeys(mobileNo);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setEmailId(String email) {
        emailId.sendKeys(email);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setAddress(String address1) {
        address.sendKeys(address1);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setCity(String cityName) {
        city.sendKeys(cityName);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setState(String stateName) {
        state.sendKeys(stateName);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setPostalCode(String pincode) {
        postalCode.sendKeys(pincode);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setUserName(String username) {
        userName.sendKeys(username);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage setPassWord(String password) {
        passWord.sendKeys(password);
        return new RegsitrationPage(driver);
    }

    public RegsitrationPage confirmPassword(String password) {
        confirmPassword.sendKeys(password);
        return new RegsitrationPage(driver);
    }

    public RegistrationSucessPage clickOnSubmit() {
        register.click();
        return new RegistrationSucessPage(driver);
    }

}