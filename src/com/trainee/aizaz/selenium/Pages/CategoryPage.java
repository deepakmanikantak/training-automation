package com.trainee.aizaz.selenium.Pages;
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
        clickElement(addtocart);
        return new AddedToCartModel(driver);
    }

    public CartPage viewCart() {
        cart.click();
        return new CartPage(driver);
    }
}