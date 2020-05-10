package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void Implicitwait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public CharSequence getRandomMails() {
        String mail = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * mail.length());
            str.append(mail.charAt(index));
        }
        String rndmail = str.toString();
        return rndmail;

    }
//uncommented inorder to re-use if necessary
    /*public  WebElement findElement(String locator,String string){
        WebElement element=null;
      if(locator=="id"){
          element=driver.findElement(By.id(string));}
      else if(locator=="className"){
          element=driver.findElement(By.className(string));}
      else if(locator=="name"){
          element=driver.findElement(By.name(string));}
      else if(locator=="xpath"){
          element=driver.findElement(By.xpath(string));}
      return element;
    }*/
    //javaScriptExecutor is used whenever clicking operstions are not performed and even when
// the element is not visible within the scope
    public void javaScriptExecutorToClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }
    public void javaScriptExecutorToScroll(WebElement element){
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,1000)");

    }

    public void explicitWait(WebDriver driver, WebElement element) {
        WebDriverWait explicitwait = new WebDriverWait(driver, 30);
        explicitwait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.time);
        wait.until((ExpectedConditions.visibilityOf(element)));
    }

}

