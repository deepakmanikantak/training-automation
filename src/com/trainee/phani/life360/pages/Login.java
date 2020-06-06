package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Basepage {
    private WebDriver driver;
    @FindBy(xpath="//input[@name='phone']")
    private WebElement enterphonenumber;
    @FindBy(xpath="//input[@name='password']")
    private  WebElement password;
    @FindBy(xpath="//button[@class='btn login']")
    private WebElement singin;
    @FindBy(xpath = "//*[@id='content']/div/div/div[2]/p/a")
    private WebElement signup;
    public Login(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
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
