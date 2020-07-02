package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourPersonalInformationPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath="//input[@data-validate='isEmail']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='breadcrumb clearfix']//a[2]")
    private WebElement myAccountIcon;

    public YourPersonalInformationPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public String getEmailId(){
        return email.getAttribute("value");
    }
    public MyAccount clickOnMyAccountIcon(){
        myAccountIcon.click();
        return new MyAccount(driver);
    }
}