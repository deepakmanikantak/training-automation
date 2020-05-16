package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Basepage {
    private WebDriver driver;
    @FindBy(xpath="//input[@name='phone']")
    private WebElement enterphonenumber;
    @FindBy(xpath="//input[@name='password']")
    private  WebElement password;
    @FindBy(xpath="//button[@class='btn login']")
    private WebElement singin;
    @FindBy(linkText = "Not a Life360 user? Register today!")
    private WebElement signup;
    public Login(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void enterphnumber(String element){
        enterphonenumber.sendKeys(element);
    }
    public void enterpassword(String element){
        password.sendKeys(element);
    }
    public Myaccount singin(){
        singin.click();
        return new Myaccount(driver);
    }
    public Signup signup(){
        signup.click();
        return new Signup(driver);
    }
}
