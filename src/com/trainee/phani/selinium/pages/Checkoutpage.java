package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage extends Basepage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement famount;
    @FindBy(xpath = "//i[@class='icon-minus']")
    private WebElement Qualitymin;
    public Checkoutpage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public String fianlamount(){
        String finalamount=famount.getText();
        return finalamount;
    }

    public void Qualitymin(){
        Qualitymin.click();


    }
}
