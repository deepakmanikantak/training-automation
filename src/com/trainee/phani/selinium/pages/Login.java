package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Basepage {
    private WebDriver driver;
    @FindBy(id="email_create")
    private WebElement emailenter;
    @FindBy(id="SubmitCreate")
    private WebElement createaccountclick;
    @FindBy(id="email")
    private WebElement emailsignin;
    @FindBy(id="passwd")
    private WebElement password;
    @FindBy(id="SubmitLogin")
    private WebElement submitlogin;
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private WebElement sigindispaly;

    public Login(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public Createaccountpage craeteaccount(){
        emailenter.sendKeys("phanindraksst@gmail.com");
        createaccountclick.click();
        return new Createaccountpage(driver);
    }
    public void getusername(String element){
        emailsignin.sendKeys(element);
    }
    public void getpassword(String element){
        password.sendKeys(element);
    }
    public Youraccount Signin(){
         submitlogin.click();
         return new Youraccount(driver);
    }
    public boolean displaysigin(){
        return sigindispaly.isDisplayed();
    }
}
