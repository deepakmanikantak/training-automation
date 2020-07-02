package com.trainee.phani.life360.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class

Basepage {
    private WebDriver driver;

    public Basepage(WebDriver driver) {
        this.driver = driver;
    }
    public  void javaScriptExecute(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }
    public  void explicitWait(WebDriver driver,WebElement element){
        WebDriverWait explicitwait=new WebDriverWait(driver,20);
        explicitwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void javascriptscroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
    public void windowhandle(int num){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

        driver.switchTo().window(tabs.get(num));
    }
}
