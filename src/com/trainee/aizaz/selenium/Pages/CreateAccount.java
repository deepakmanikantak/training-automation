package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement genderFemale;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@data-validate='isPasswd']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//div[@id='uniform-id_state']//option[@value='13']")
    private WebElement state;

    @FindBy(xpath = "//select[@name='id_state']")
    private WebElement stateSection;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postcode;

    @FindBy(xpath = "//select[@id='id_country']")
    private WebElement countrySection;

    @FindBy(xpath = "//select[@id='id_country']//option[@value='21']")
    private WebElement country;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement mobileNo;

    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement register;

    @FindBy(xpath = "//label[@for='id_state']")
    private WebElement stateHeading;

    public CreateAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CreateAccount clickOnGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            genderMale.click();
        } else if (gender.equalsIgnoreCase("female")) {
            genderFemale.click();
        }
        return new CreateAccount(driver);
    }

    public CreateAccount setFirstName(String firstname) {
        firstName.sendKeys(firstname);
        return new CreateAccount(driver);
    }

    public CreateAccount setLastName(String lastname) {
        lastName.sendKeys(lastname);
        return new CreateAccount(driver);
    }

    public CreateAccount setPassword(String passWord) {
        password.sendKeys(passWord);
        return new CreateAccount(driver);
    }

    public CreateAccount setAddress(String addressLane) {
        address.sendKeys(addressLane);
        return new CreateAccount(driver);
    }

    public CreateAccount setCityName(String cityName) {
        city.sendKeys(cityName);
        return new CreateAccount(driver);
    }

    public CreateAccount clickOnCountry() {
        countrySection.click();
        country.click();
        return new CreateAccount(driver);
    }

    public CreateAccount clickOnState(int index) {
        Select state = new Select(stateSection);
        state.selectByIndex(index);
        return new CreateAccount(driver);
    }

    public CreateAccount setPostcode(String postalcode) {
        postcode.sendKeys(postalcode);
        return new CreateAccount(driver);
    }

    public CreateAccount setMobileNo(String mobileno) {
        mobileNo.sendKeys(mobileno);
        return new CreateAccount(driver);
    }

    public MyAccount clickOnRegister() {
        register.click();
        return new MyAccount(driver);
    }
    public boolean registerButtonFind() {
        return register.isDisplayed();
    }
}