package com.trainee.aizaz.selenium.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage {
   private WebDriver driver;
   @FindBy(xpath ="//input[@id='id_gender1']")
   private WebElement genderMale;
    @FindBy(xpath ="//input[@id='id_gender2']")
    private WebElement genderFemale;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastName;
    @FindBy(xpath ="//input[@data-validate='isPasswd']" )
    private WebElement password;
    @FindBy(xpath="//input[@name='address1']")
    private WebElement address;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;
    @FindBy(xpath = "//div[@id='uniform-id_state']//option[@value='13']")
    private WebElement state;
    @FindBy(xpath = "//select[@name='id_state']")
    private WebElement hoverState;
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postcode;
    @FindBy(xpath = "//select[@id='id_country']")
    private WebElement hoverCountry;
    @FindBy(xpath = "//select[@id='id_country']//option[@value='21']")
    private WebElement country;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement mobileNo;
    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement register;
    @FindBy(xpath = "//label[@for='id_state']")
    private WebElement stateHeading;
    public CreateAccount(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public MyAccount accountDetailsforRegistration(){
        maximizeAndImplicit(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        genderMale.click();
        firstName.sendKeys("aizaz");
        lastName.sendKeys("ahmed");
        password.sendKeys("hello");
        address.sendKeys("james road");
        city.sendKeys("chicago");
        javaScriptExecute(hoverCountry);
        javaScriptExecute(country);
        Select state=new Select(hoverState);
        state.selectByIndex(5);
        postcode.sendKeys("00000");
        mobileNo.sendKeys("2085557704");
        javaScriptExecute(register);
        return new MyAccount(driver);
    }
    public boolean registerButtonFind(){
        return register.isDisplayed();
    }
}
