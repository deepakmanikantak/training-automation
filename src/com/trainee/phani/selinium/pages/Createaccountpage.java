package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createaccountpage extends Basepage{
    private WebDriver driver;
    @FindBy(id="id_gender1")
    private WebElement mrradio;
    @FindBy(id="id_gender2")
    private WebElement msradio;
    @FindBy(id="customer_firstname")
    private WebElement firstname;
    @FindBy(id="customer_lastname")
    private WebElement lastname;
    @FindBy(id="passwd")
    private WebElement password;
    @FindBy(id="newsletter")
    private WebElement checkboxnewsletter;
    @FindBy(id="optin")
    private WebElement checkboxoffers;
    @FindBy(id="firstname")
    private WebElement addressfirstname;
    @FindBy(id="company")
    private WebElement comapnayname;
    @FindBy(id="address1")
    private WebElement address1;
    @FindBy(id="address2")
    private WebElement address2;




    public Createaccountpage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
