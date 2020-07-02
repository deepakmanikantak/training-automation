package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(id="city")
private WebElement city;
    @FindBy(id="postcode")
    private WebElement postalcode;
    @FindBy(id="other")
    private WebElement other;
    @FindBy(id="phone")
    private WebElement homephone;
    @FindBy(id="phone_mobile")
    private WebElement phonemobile;
    @FindBy(id="alias")
    private WebElement myaddress;
    @FindBy(id="submitAccount")
    private WebElement register;
    public Createaccountpage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void getgendermr(){
        mrradio.click();
    }
    public void getgenderms(){
        msradio.click();
    }
    public void getfirstname(String element){
        firstname.sendKeys(element);
    }
    public void getlastname(String element){
        lastname.sendKeys(element);
    }
    public void getpassword(String element){
        password.sendKeys(element);
    }
    public void getcheckboxnewsletter(){
        checkboxnewsletter.click();
    }
    public void getcheckboxoffers(){
        checkboxoffers.click();
    }
    public void getaddressfirstname(String element){
        addressfirstname.sendKeys(element);
    }
    public void getcompanyname(String element){
        comapnayname.sendKeys(element);
    }
    public void getaddress1(String element){
        address1.sendKeys(element);
    }
    public void getaddress2(String element){
        address2.sendKeys(element);
    }
    public void getcity(String element){
        city.sendKeys(element);
    }
    public void getpostalcode(String element){
        postalcode.sendKeys(element);
    }
    public void getother(String element){
        other.sendKeys(element);
    }
    public void gethomephone(String element){
        homephone.sendKeys(element);
    }
    public void getphonemobile(String element){
        phonemobile.sendKeys(element);
    }
    public void getmyaddress(String element){
        myaddress.sendKeys(element);
    }
    public void register(){
        register.click();

    }
}
