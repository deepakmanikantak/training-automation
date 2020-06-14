package com.trainee.phani.life360.pages;

import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccount extends Basepage {
     private WebDriver driver;
     @FindBy(xpath="//li[@class='circle-item-button']")
     private WebElement createcircle;
     @FindBy(xpath="//*[@id='addmember'']/div/div[1]/div[1]/div[1]/h5")
     private WebElement clickoncustomcircle;
    // @FindBy(xpath="//*[@id='addmember']/div/div[2]/button")
    // private WebElement clickoncreatecircle;
    public Myaccount(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
