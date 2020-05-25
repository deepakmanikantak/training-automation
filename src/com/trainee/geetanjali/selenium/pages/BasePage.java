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

   /* public static void ImplicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }*/

    public CharSequence getRandomMails() {
        String mail = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < 10) {
            int index = (int) (rnd.nextFloat() * mail.length());
            str.append(mail.charAt(index));
        }
        String rndmail = str.toString();
        return rndmail;
    }

    public void javaScriptExecutorToClick(WebElement element) {
        JavascriptExecutor click = (JavascriptExecutor) driver;
        click.executeScript("arguments[0].click()", element);
    }

    public void javaScriptExecutorToScroll(WebElement element) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.ScrollBy(0,1000)");
    }

    public void explicitWait(WebDriver driver, WebElement element) {
        WebDriverWait explicitwait = new WebDriverWait(driver, 30);
        explicitwait.until((ExpectedConditions.visibilityOf(element)));
    }
}
