package com.trainee.phani.life360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers extends Basepage {
    private WebDriver driver;
    @FindBy(xpath="//a[class='button']")
    private WebElement gotitincareers;
    public Careers(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickgoiitbutton(){
        gotitincareers.click();
    }
}
