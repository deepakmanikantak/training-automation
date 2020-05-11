package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@title='Log me out']")
    private WebElement logout;

    @FindBy(xpath = "//a[@class='home']")
    private WebElement home;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountText;

    @FindBy(xpath = "//a[@title='Information']")
    private WebElement myInformation;

    public MyAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public AuthenticationPage logout() {
        logout.click();
        return new AuthenticationPage(driver);
    }

    public HomePage returnHomePage() {
        home.click();
        return new HomePage(driver);
    }

    public boolean myAccountHeading() {
        return myAccountText.isDisplayed();
    }

    public boolean myPersonalInformationSectionDisplayed() {
        return myInformation.isDisplayed();
    }

    public YourPersonalInformationPage myPersonalInformationSectionClick() {
        myInformation.click();
        return new YourPersonalInformationPage(driver);
    }
}