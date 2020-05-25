package com.trainee.geetanjali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Purpose of this class is to perform the operations inorder to verify the logo and title and to add an item into cart
 * and then checkout and to compare the both before and after checkout prices.
 *
 * @author geetanjali
 */
public class InspectElementsAndApplyWaits {
    public static void main(String args[]) {
        String expectedTitle = "My Store";
        //getting the directory of chromedriver by using getProperty method
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        //implicit waits are used as it takes time to load the page so by using implicit waits it will wait until the specified time through out the driver instance
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //here we are maximizing the window
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://automationpractice.com/index.php");
        //it finds the logo by using xpath as an locator
        WebElement element = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        //isDisplayed method returns true if the element is displayed in the webpage.
        if (element.isDisplayed()) {
            System.out.println("logo is displayed on the home page");
        } else {
            System.out.println("logo is not displayed on the home page");
        }
        //getTitle method is used in order to get the title of a webpage
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        //it checks if the expected title and actual title ar equal or not
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Both expected title and actual title are same");
        } else {
            System.out.println("Both expected title and actual title are not same");
        }
        //finding a top by using xpath as an locator and to click on it
        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
        //as clicking operation is not performing by webdriver commands i am using javascript executor to perform that operation
        jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='Add to cart']")));
        //i have taken explicit waits  in order to wait for a particular amount of time until the expected condition satisfies as it is taking some time to get visible.
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ajax_block_cart_total']")));
        //finding the price of a product by using xpath as a locator
        WebElement text = driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"));
        //here i am getting the text of the price after adding it into cart by using getText method and i have given it to addtocartprice variable.
        String addtocartprice = text.getText();
        System.out.println("price displayed after adding item to cart:" + addtocartprice);
        //as proceed to checkout button is not responding while performing click operation i am using javascript executor
        jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
        //finding the price of a product by using xpath as a locator in checkoutpage
        WebElement price = driver.findElement(By.xpath("//span[@id='total_price']"));
        //here i am getting the text of the price and storing in a variable
        String checkoutprice = price.getText();
        System.out.println("price displayed on checkout page" + checkoutprice);
        //it checks if both prices are equal or not
        if (addtocartprice.equals(checkoutprice)) {
            System.out.println("both prices are equal");
        } else
            System.out.println("both prices are not equal");
        driver.quit();
    }
}

