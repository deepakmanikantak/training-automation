package com.trainee.aizaz.selenium.PagesOfFlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationSucessPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//img[@src='/images/masts/mast_register.gif']")
    private WebElement registerLogo;
    @FindBy(linkText = "Home")
    private WebElement home;

    public RegistrationSucessPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean registerLogoFound() {
        visibilityOfElement(registerLogo);
        return registerLogo.isDisplayed();
    }

    public HomePage clickOnHome() {
        home.click();
        return new HomePage(driver);
    }

}