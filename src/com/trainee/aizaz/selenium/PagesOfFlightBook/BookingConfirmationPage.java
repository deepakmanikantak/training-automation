package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmationPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//img[@src='/images/masts/mast_confirmation.gif']")
    private WebElement bookingConfirmationMessage;

    @FindBy(xpath = "//img[@src='/images/forms/Logout.gif']")
    private WebElement logout;

    public BookingConfirmationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean bookingConfirmationMessageIsDisplayed() {
        visibilityOfElement(bookingConfirmationMessage);
        return bookingConfirmationMessage.isDisplayed();
    }

    public void logOut() {
        logout.click();
    }
}