package com.trainee.aizaz.selenium.Pages;

//import com.trainee.aizaz.selenium.GlobalVariables;

import com.sun.tools.example.debug.expr.ExpressionParser;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath ="//a[@title='Add to cart']" )
    private WebElement addtocart;
    @FindBy(xpath ="//a[@title='View my shopping cart']" )
    private WebElement cart;

    public CategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public AddedToCartModel addProductToCart() {
       /* WebElement addtocart = findElement(GlobalVariables.xpath, "//a[@title='Add to cart']");*/
        clickElement(addtocart);
        return new AddedToCartModel(driver);
    }

    public CartPage viewCart() {
      /*  WebElement cart = findElement(GlobalVariables.xpath, "//a[@title='View my shopping cart']");*/
        cart.click();
        return new CartPage(driver);

    }
}