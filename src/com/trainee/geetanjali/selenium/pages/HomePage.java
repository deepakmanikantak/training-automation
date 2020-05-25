package com.trainee.geetanjali.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@title='Women']")
    private WebElement hoverOnwomen;
    @FindBy(xpath = "//a[@title='Women']/..//a[@title='T-shirts']")
    private WebElement clickontshirts;
    @FindBy(xpath = "//a[@class='login']")
    private WebElement signin;
    @FindBy(xpath = "//span[text()='geetanjali guda']")
    public WebElement checkSigninName;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SignInPage clickOnSignIn() {
        javaScriptExecutorToClick(signin);
        return new SignInPage(driver);
    }

    public CategoryPage clickOnTshirts() {

        Actions action = new Actions(driver);
        action.moveToElement(hoverOnwomen).click(clickontshirts).build().perform();
        return new CategoryPage(driver);
    }

    public String verifyingSigninName() {

        String signinNameText=checkSigninName.getText();
        return "geetanjali guda";
    }


}

