package com.trainee.phani.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * program to automate the ecommerce website from end to end logo chech->title check->add item in cart->checkout->
 * comapring the cart amount and final amount is equal or not
 *
 * @author phani
 */

public class SeliniumWebDriver {
    public static void main(String[] args) {
        // Below property gives the path of the project location
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        //page will take some time to load so we take implicit waits here
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Perform the rest of the operations
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        //for to check logo is presented or not
        boolean logo = driver.findElement(By.id("header_logo")).isDisplayed();
        if (logo) {
            System.out.println("logo is displayed");
        } else {
            System.out.println("logo is not diplayed");
        }
        String title = "My Store";
        String orginaltitle = driver.getTitle();
        //for to check title is same or not
        if (orginaltitle.equals(title)) {
            System.out.println("Tiles is matched");
        } else {
            System.out.println("Titles are not matched");
        }
        //this is for to click on tshirts button
        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
        // js.executeScript("window.scrollBy(0,700)");
        //java scriprt executor is used to find the elements wihich are not there in eye scope
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='Add to cart']")));
        //expicit wait is used for to ewait for some paticular time to load the page and to statisfy the condition
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ajax_block_cart_total']")));
        //finding the amount that displayed in cart
        WebElement camount = driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"));
        //by using .getText method we are finding the text
        String cartamount = camount.getText();
        //by using jse we are clicking on check out button
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
        //finding thev final amount that displayed in check out page
        WebElement famount = driver.findElement(By.xpath("//span[@id='total_price']"));
        String fianlamount = famount.getText();
        //comparing the two amounts that ate equal or not by usig if condition
        if (cartamount.equals(fianlamount)) {
            System.out.println("Prices are equal");
        } else
            System.out.println("Prices are not equal");
    }

}







