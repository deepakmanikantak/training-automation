package com.trainee.phani.selinium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Basepage {
    private WebDriver driver;

  public Basepage(WebDriver driver) {
      this.driver = driver;
  }

    public static void maximizeAndImplicit(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    public WebElement findElement(String locator, String text) {
        WebElement element = null;
        if (locator.equalsIgnoreCase("xpath")) {
            element = driver.findElement(By.xpath(text));

        } else if (locator.equalsIgnoreCase("id")) {
            element = driver.findElement((By.id(text)));

        } else if (locator.equalsIgnoreCase("className")) {
            element = driver.findElement((By.className(text)));

        } else if (locator.equalsIgnoreCase("name")) {
            element = driver.findElement((By.name(text)));
        }
        return element;
    }

    /**
     * method for JavaScriptExecutor:
     * @param element
     */
    public  void javaScriptExecute(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }

    public  void javaScriptExecute1(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].getText()", element);
    }
    /**
     * Explixit wait
     */
    public  void explicitWait(WebDriver driver,WebElement element){
        WebDriverWait explicitwait=new WebDriverWait(driver,20);
        explicitwait.until(ExpectedConditions.visibilityOf(element));
    }
}

