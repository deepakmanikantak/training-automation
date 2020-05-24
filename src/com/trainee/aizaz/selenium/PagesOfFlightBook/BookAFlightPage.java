package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookAFlightPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='passFirst0']")
    private WebElement passengerFirstName;

    @FindBy(xpath = "//input[@name='passLast0']")
    private WebElement passengerLastName;

    @FindBy(xpath = "//input[@name='creditnumber']")
    private WebElement cardNo;

    @FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
    private WebElement cardExpiryMonth;

    @FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
    private WebElement cardExpiryYear;

    @FindBy(xpath = "//input[@name='cc_frst_name']")
    private WebElement firstNameOfCardHolder;

    @FindBy(xpath = "//input[@name='cc_mid_name']")
    private WebElement middleNameOfCardHolder;

    @FindBy(xpath = "//input[@name='cc_last_name']")
    private WebElement lastNameOfCardHolder;

    @FindBy(xpath = "//input[@name='buyFlights']")
    private WebElement securePurchase;

    public BookAFlightPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public BookAFlightPage setpassengerFirstName(String fisrtname) {
        passengerFirstName.sendKeys(fisrtname);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage setpassengerLasttName(String lastname) {
        passengerLastName.sendKeys(lastname);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage setCreditCardNo(String cardno) {
        cardNo.sendKeys(cardno);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage cardExpiryMonth(String month) {
        Select cardMonth = new Select(cardExpiryMonth);
        cardMonth.selectByVisibleText(month);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage cardExpiryYear(String year) {
        Select cardYear = new Select(cardExpiryYear);
        cardYear.selectByValue(year);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage setFirstNameOfCardHolder(String name) {
        firstNameOfCardHolder.sendKeys(name);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage setMiddleNameOfCardHolder(String name) {
        middleNameOfCardHolder.sendKeys(name);
        return new BookAFlightPage(driver);
    }

    public BookAFlightPage setLastNameOfCardHolder(String name) {
        lastNameOfCardHolder.sendKeys(name);
        return new BookAFlightPage(driver);
    }

    public BookingConfirmationPage clickOnSecurePurchase() {
        securePurchase.click();
        return new BookingConfirmationPage(driver);
    }
}