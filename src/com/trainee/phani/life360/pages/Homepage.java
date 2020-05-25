package com.trainee.phani.life360.pages;


import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage  extends Basepage {
private WebDriver driver;
@FindBy(xpath="//div[@class='header__signup']")
private WebElement clickonsignn;
@FindBy(id="menu-item-31014")
private WebElement clickonmemeberstories;
@FindBy(id="menu-item-31015")
private WebElement careers;
@FindBy(xpath="//a[class='button']")
private WebElement gotitincareers;
@FindBy(id="menu-item-31013")
private WebElement support;
    public Homepage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public Login signin(){
        clickonsignn.click();
        return new  Login(driver);
    }
    public Memberstories getmemeberstories(){
        clickonmemeberstories.click();
        return new Memberstories(driver);
    }
    public Careers getcareers(){
        careers.click();
        return new Careers(driver);
    }
    public Support getsupport(){
        support.click();
        return new Support(driver);
    }
}