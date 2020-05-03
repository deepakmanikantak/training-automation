package com.trainee.aizaz.selenium.Pages;

//import com.trainee.aizaz.selenium.GlobalVariables;

import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CategoryPage clickOnTshirts() {
        maximizeAndImplicit(driver);
        driver.get("http://automationpractice.com/index.php");
        WebElement women = null;
        WebElement tshirt = null;
        women = findElement(GlobalVariables.xpath, "//a[@title='Women']");
        tshirt = findElement(GlobalVariables.xpath, "//a[@title='Women']/..//a[@title='T-shirts']");

        Actions action = new Actions(driver);
        action.moveToElement(women).click(tshirt).build().perform();
        return new CategoryPage(driver);
    }


}
