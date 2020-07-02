package com.trainee.phani.life360.pages;



import org.openqa.selenium.JavascriptExecutor;
import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class Homepage  extends Basepage {
private WebDriver driver;
@FindBy(xpath="/html/body/header/div/div[2]/div/a")
private WebElement clickonsignn;
@FindBy(id="menu-item-31014")
private WebElement clickonmemeberstories;
@FindBy(id="menu-item-31015")
private WebElement careers;
@FindBy(xpath="//a[class='button']")
private WebElement gotitincareers;
@FindBy(id="menu-item-31013")
private WebElement support;
@FindBy(xpath="//*[@id='player_uid_132122733_1']/div[1]/video")
private WebElement youtubedispaly;
@FindBy(xpath="/html/body/main/section[3]/div[2]/div[1]/div/a/span")
private WebElement playyoutube;
@FindBy(xpath = "//*[@id='player_uid_884921429_1']/div[1]/video")
private WebElement pausevideo;
@FindBy(xpath="//*[@title='Close']")
private WebElement closevideo;
@FindBy(xpath="/html/body/main/section[3]/div[2]/div[1]/div/a")
private WebElement verifyvideoclosed;
@FindBy(xpath="/html/body/header/div/div/div/a[1]")
private WebElement clickdownload;
@FindBy(xpath="/html/body/main/section[4]/div[2]/div[2]/div[2]/a[1]/img")
private WebElement appstorelogo;
@FindBy(xpath="//*[@id='menu-item-32768']/a")
private WebElement donotsell;
@FindBy(xpath="//*[@id='website-footer']/div/div[2]/div[3]/a[1]/img")
private WebElement clickonFB;

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
    public void palyyoutube(){
       // javaScriptExecute(playyoutube);
        playyoutube.click();
    }
    public void pausevideo(){
        javaScriptExecute(pausevideo);
        pausevideo.click();
    }
    public void scrollpage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
    public Boolean youtubedisplay(){
        explicitWait(driver,youtubedispaly);
        return youtubedispaly.isDisplayed();
    }
    public void closevideo(){
      /**  Actions action = new Actions(driver);
        action.moveToElement(closevideo).build().perform();
        closevideo.click();*/
     // explicitWait(driver,closevideo);
        try {
            javaScriptExecute(closevideo);
            closevideo.click();
        }catch (Exception e){

    }}
    public Boolean verifyvideoclosed(){
        return playyoutube.isDisplayed();
    }
    public Download clickdownload(){
        clickdownload.click();
        return new Download(driver);
    }
    public Boolean appstorelogo(){
       return appstorelogo.isDisplayed();
    }
    public void donotsell(){
        donotsell.click();
    }
    public void clickonFB(){
        clickonFB.click();
    }
}