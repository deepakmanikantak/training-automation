package com.trainee.aizaz.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * The purpose of this class is to execute script using BasePage and
 * Global Variables....
 *
 * @author aizaz
 */
public class ScriptByMethods {
    public static void main(String[] args) {
        /**
         * BasePage.browser() is a method in BasePage class and
         * GlobalVariables.url is a parameter which is GlobalVariable class
         * as these are static methods we are calling it by class name...
         */
        WebDriver driver = BasePage.browser(GlobalVariables.browserChrome);
        /**
         * This method is present in BasePage class which maximize the window
         * and also applies the implicit wait...
         */
        BasePage.maximizeAndImplicit(driver);

        //GlobalVariables.url is a parameter from GlobalVariable Class
        driver.get(GlobalVariables.url);
        /**
         * here we are using BasePage.findElement method which take driver,
         * TYPE OF LOCATOR,LOCATOR value as parameter:
         */
        WebElement logoElement = BasePage.findElement(driver, GlobalVariables.xpath, "//img[@class='logo img-responsive']");

        /**
         * checking wheteher logo is diplayed or not
         */
        if (logoElement.isDisplayed()) {
            System.out.println("logo is displayed \n Test passed");
        } else {
            System.out.println("Test Failed");
        }
        //click on T-shirt section:
        WebElement tshirt = BasePage.findElement(driver, GlobalVariables.xpath, "//div[@id='block_top_menu']/ul/li[3]/a");
        tshirt.click();

        /**
         * Now clicking on addtocart using common method JavaScriptExecutor
         * which will be taking driver and element as parameter
         */
        WebElement addtocart = BasePage.findElement(driver, GlobalVariables.xpath, "//div[@class='button-container']//a[@title='Add to cart']");
        BasePage.javaScriptExecute(driver, addtocart);
        /**
         * cartprice visibility using common method for explicit wait:
         */
        WebElement cartPrice = BasePage.findElement(driver, GlobalVariables.id, "total_price");
        {
            BasePage.explicitWait(driver, cartPrice);
        }
        driver.quit();
    }
}