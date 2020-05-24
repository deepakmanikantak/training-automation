package com.trainee.aizaz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonStaticMethods {
    /**
     * this method is used for the selection of broswer we
     * are here taking parameter as browserName which is in GlobalVariables class
     *
     * @param browserName
     */
    public static WebDriver driverSelection(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
            System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        } else {
            String firefoxDriverPath = System.getProperty("user.dir") + "/drivers/geckodriver";
            System.out.println("firefox located At Path: " + firefoxDriverPath);
            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            driver = new FirefoxDriver();
        }
        return driver;
    }

    /**
     * used to Maximize and apply Implicit wait:
     *
     * @param driver
     */
    public static void maximizeAndImplicit(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * here we are taking parameters as driver,type of locator,text(locators value) as
     * a parameter which will return element
     * <p>
     * USES:
     * --------->the use of this method is we can findElement from any locator just we have
     * to enter it as a parameter...
     *
     * @param driver
     * @param locator
     * @param text
     * @return element
     */
    public static WebElement findElement(WebDriver driver, String locator, String text) {
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
     * @param driver
     * @param element
     */
    public static void javaScriptExecute(WebDriver driver,WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }

    /**
     * this method is used to apply explixit wait
     * @param driver
     * @param element
     */
    public static void explicitWait(WebDriver driver,WebElement element){
        WebDriverWait explicitwait=new WebDriverWait(driver,20);
        explicitwait.until(ExpectedConditions.visibilityOf(element));
    }
}