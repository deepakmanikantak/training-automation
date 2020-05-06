package com.trainee.phani.selinium.pages;

import deepak.selenium.pages.AddedToCartModalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends Basepage{
    private WebDriver driver;
    @FindBy(xpath = "//a[@title='Add to cart']")
    private WebElement addcart;

    public CategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public AddedToCartModalPage addProductToCart() {
        addcart.click();


        return new AddedToCartModalPage(driver);

    }
}