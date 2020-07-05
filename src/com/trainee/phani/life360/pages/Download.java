package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Download  extends Basepage{
    private WebDriver driver;
    public Download (WebDriver driver){
        super(driver);
        this.driver= driver;

    }
    public String downloadpagetitle(){
         String orginaltitle=driver.getTitle();
         return orginaltitle;
    }
}
