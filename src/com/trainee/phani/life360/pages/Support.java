package com.trainee.phani.life360.pages;

import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;

public class Support extends Basepage {
    private WebDriver driver;
    public Support(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
