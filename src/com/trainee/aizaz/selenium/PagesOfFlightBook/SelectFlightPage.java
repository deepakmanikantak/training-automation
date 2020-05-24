package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlightPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@name='reserveFlights']")
    private WebElement continuee;

    public SelectFlightPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }
    public BookAFlightPage continueToBookFlightPage() {
        continuee.click();
        return new BookAFlightPage(driver);

    }
}