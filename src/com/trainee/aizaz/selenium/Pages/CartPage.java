package com.trainee.aizaz.selenium.Pages;

import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String cartPrice() {
        WebElement cartitem = findElement(GlobalVariables.xpath, "//tr[@class='cart_total_price']//td[2]/span[@id='total_price']");
        explicitWait(driver, cartitem);
        return cartitem.getText();

    }
    public void removeItem() {
        WebElement removeItem = findElement(GlobalVariables.xpath, "//i[@class='icon-minus']");
        removeItem.click();

    }
}
