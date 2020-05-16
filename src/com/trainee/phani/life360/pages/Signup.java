package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup extends Basepage {
     private WebDriver driver;
     @FindBy(id="UserFirstName")
     private WebElement firstname;
     @FindBy(id="UserLastName")
     private WebElement lastname;
     @FindBy(id="UserEmail")
     private WebElement emailid;
     @FindBy(id="mobile-number")
     private WebElement mobilenumber;
     @FindBy(id="UserPassword")
     private WebElement password;
     @FindBy(id="UserPassword")
     private WebElement confirmpassword;
     @FindBy(id="doSend")
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
    public void getemailid(String element){
        emailid.sendKeys(element);
    }
    public void getmobilenumber(String element){
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
