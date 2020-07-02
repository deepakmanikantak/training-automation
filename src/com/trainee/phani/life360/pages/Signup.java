package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup extends Basepage {
     private WebDriver driver;
     @FindBy(xpath="//*[@id='UserFirstName']")
     private WebElement firstname;
     @FindBy(xpath="//*[@id='UserLastName']")
     private WebElement lastname;
     @FindBy(xpath="//*[@id='UserEmail']")
     private WebElement emailid;
    @FindBy(xpath = "//li[@id=\"iti-item-us\"]/span[1]/../../../div")
    private WebElement countrycode;
     @FindBy(xpath="//*[@id='mobile-number']")
     private WebElement mobilenumber;
     @FindBy(xpath="//*[@id='UserPassword']")
     private WebElement password;
     @FindBy(xpath="//*[@id='UserPasswordConfirm']")
     private WebElement confirmpassword;
     @FindBy(xpath="//*[@id='doSend']")
     private WebElement submit;
    public Signup(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void getfirstname(String element){
        firstname.sendKeys(element);
    }
    public void getlastname(String element){
        lastname.sendKeys(element);
    }
    public void getemailid(String element) {
        emailid.sendKeys(element);
    }
        public void selectCountry() {
            countrycode.click();
        }
    public void getmobilenumber(String element){
      //  explicitWait(driver,mobilenumber);
        mobilenumber.clear();
        mobilenumber.click();
        mobilenumber.sendKeys(element);
    }
    public void getpassword(String element){
        password.sendKeys(element);
    }
    public void getconfirmpassword(String element){
        confirmpassword.sendKeys(element);
    }
    public Myaccount submit(){
        submit.click();
        return new Myaccount(driver);
    }
}
