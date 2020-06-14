package com.trainee.phani.life360.pages;

import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;

public class Memberstories extends Basepage {
    private WebDriver driver;
    public Memberstories(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
