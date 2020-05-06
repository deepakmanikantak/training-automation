package com.trainee.aizaz.selenium.Pages;

import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//tr[@class='cart_total_price']//td[2]/span[@id='total_price']")
    private WebElement cartitem;
    @FindBy(xpath = "//i[@class='icon-minus']")
    private WebElement removeItem;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String cartPrice() {

      //  WebElement cartitem = findElement(GlobalVariables.xpath, "//tr[@class='cart_total_price']//td[2]/span[@id='total_price']");
        explicitWait(cartitem);
        return cartitem.getText();

    }
    public CartPage removeItem() {
        //WebElement removeItem = findElement(GlobalVariables.xpath, "//i[@class='icon-minus']");
        removeItem.click();
        return new CartPage(driver);
    }
}
