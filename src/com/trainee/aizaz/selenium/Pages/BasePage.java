package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;
    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public static void maximizeAndImplicit(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * This method is alternate o @FindBy method
     *
     * @param locator
     * @param text
     * @return
     */
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
     * method for JavaScriptExecutor to click:
     *@param element
     */
    public void clickElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }

    //This method is to apply explicit wait till element is visible
    public void visibilityOfElement(WebElement element) {
        WebDriverWait explicitwait = new WebDriverWait(driver, 20);
        explicitwait.until(ExpectedConditions.visibilityOf(element));
    }
}