package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTrip;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement oneWay;

    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement passenger;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departLocation;

    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement month;

    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement day;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivingLocation;

    @FindBy(xpath = "//select[@name='toMonth']")
    private WebElement returnMonth;

    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement returnDay;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyClass;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessClass;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement firstClass;

    @FindBy(xpath = "//input[@name='findFlights']")
    private WebElement continuee;

    public FlightFinderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public FlightFinderPage bookingType(String type) {
        if (type.equalsIgnoreCase("roundtrip")) {
            roundTrip.click();
        } else if (type.equalsIgnoreCase("oneway")) {
            oneWay.click();
        }
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage noOfPassengers(int index) {
        Select noOfPassengers = new Select(passenger);
        noOfPassengers.selectByIndex(index);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setDepartLocation(String location) {
        Select depart = new Select(departLocation);
        depart.selectByValue(location);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setDepartMonth(String monthInNumber) {
        Select selectMonth = new Select(month);
        selectMonth.selectByValue(monthInNumber);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setDepartDay(String dayValue) {
        Select selectDate = new Select(day);
        selectDate.selectByValue(dayValue);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setArrivingLocation(String location) {
        Select selectArriveLocation = new Select(arrivingLocation);
        selectArriveLocation.selectByValue(location);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setReturnMonth(String monthInNumber) {
        Select selectReturnMonth = new Select(returnMonth);
        selectReturnMonth.selectByValue(monthInNumber);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage setReturnDay(String dayValue) {
        Select selectReturnDay = new Select(returnDay);
        selectReturnDay.selectByValue(dayValue);
        return new FlightFinderPage(driver);
    }

    public FlightFinderPage selectClass(String className) {
        if (className.equalsIgnoreCase("economy class")) {
            economyClass.click();
        } else if (className.equalsIgnoreCase("business class")) {
            businessClass.click();
        } else if (className.equalsIgnoreCase("first class")) {
            firstClass.click();
        }
        return new FlightFinderPage(driver);
    }

    public SelectFlightPage clickOnContinue() {
        continuee.click();
        return new SelectFlightPage(driver);
    }
}