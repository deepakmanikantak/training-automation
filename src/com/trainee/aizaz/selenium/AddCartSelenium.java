package com.trainee.aizaz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
/**
 * The purpose of this script is to Launch APP > Verify LOGO > Verify Page Title >
 * Click on T shirts > Add item > Grab the Total Price >
 * Click on checkout > Verify the Total Price is same as it is in cart
 * @author aizaz
 */
public class AddCartSelenium extends Thread {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        /**
         * implicit wait provide default waiting time between
         * each consecutive command across the entire test script.
         */
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        /**
         * To find whether logo is displayed or not we need to go for isDisplayed() method
         * which returns boolean value
         */
        boolean logo = driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
        /**
         * this logic displays whether the logo is displayed or not
         */
        if (logo) {
            System.out.println("LOGO DISPLAYED SUCESSFULLY");

        } else {
            System.out.println("LOGO NOT DISPLAYED");
        }
        String expectedTitle = "My Store";
        /**
         * to retrive the actual title we need to use getTitle() method
         * which will return string value.
         */
        String actualTitle = driver.getTitle();
        /**
         * this logic is used to compare actual title with expected title
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title Incorrect");
        }
        System.out.println(expectedTitle);
        //below we are finding the T-shirt section using x-path:
        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
        WebElement addtocart = driver.findElement(By.xpath("//div[@class='button-container']//a[@title='Add to cart']"));
        /**sometimes click() command doesn't work at that time we need to go for JavaScriptExecutor
         *interface to perform those operations.
         * here add to cart was not getting performed by direct click so we used JavaScriptExecutor to perform click
         */
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", addtocart);
        /**
         * Explicit waits are used to halt the execution until the time a particular condition is
         * met or maximum time is elapsed
         * here below we are using explicit in order to load item price
         */
        WebDriverWait explicitwait = new WebDriverWait(driver, 90);
        WebElement total = driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"));
        explicitwait.until(ExpectedConditions.visibilityOf(total));
        /**
         * getText() method is used to get the text of particular element
         */
        String price = total.getText();
        System.out.println("the price is:" + price);
        WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        /**
         * clicking on proceed to checkout
         */
        jse.executeScript("arguments[0].click()", checkout);
        //getting checkout price by using getText() method:
        String checkoutprice = driver.findElement(By.id("total_price")).getText();
        System.out.println("the CheckOut Price is:" + checkoutprice);
        /**
         * this is the logic which compares cart price with checkout price.
         */
        if (price.contentEquals(checkoutprice)) {
            System.out.println("THE TOTAL PRICE IS SAME AS CART ");
        } else {
            System.out.println("THE TOTAL PRICE DOESN'T MATCH THE CART PRICE ");
        }
        driver.quit();
    }
}