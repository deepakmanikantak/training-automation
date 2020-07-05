package com.trainee.phani.selinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youraccount extends Basepage{

    private WebDriver driver;
    @FindBy(xpath = "//a[@class='logout']")
    private WebElement signout;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
    private WebElement mypersonalinfo;

    public Youraccount(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String gettitle(){
        String orginaltitle=driver.getTitle();
        return orginaltitle;
    }
     public void signout() {
         signout.click();
     }
      public Personalinfo clickpersonalinfo(){
       mypersonalinfo.click();
       return new Personalinfo(driver);
         }
     }


