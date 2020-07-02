package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Personalinfo extends Basepage {
    WebDriver driver;
    @FindBy(xpath="//input[@id='email']")
    private WebElement verifyemail;
    @FindBy(xpath="//a[@class='logout']")
    private WebElement signout;

    public Personalinfo(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public String verifyaccount() {
        return verifyemail.getAttribute("value");
    }
        public void signout(){
        signout.click();

        }
    }

