package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{
    private WebDriver driver;
    @FindBy(xpath="//a[@title='Add to cart']")
     private WebElement addtocart;
     @FindBy(xpath="//a[@title='View my shopping cart']")
     private WebElement shoppingcart;
    public CategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public AddtoCartConfirmationPage addProductToCart() {
        //WebElement addtocart = findElement(GlobalVariables.xpath, "//a[@title='Add to cart']");
        javaScriptExecutorToClick(addtocart);
        return new AddtoCartConfirmationPage(driver);
    }

    public OrderConfirmationPage clickOnCart() {
        //WebElement clickoncart = findElement(GlobalVariables.xpath, "//a[@title='View my shopping cart']");
        shoppingcart.click();
        return new OrderConfirmationPage(driver);

    }

}

