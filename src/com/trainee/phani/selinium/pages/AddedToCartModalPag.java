package com.trainee.phani.selinium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddedToCartModalPag extends Basepage{
    private WebDriver driver;
    @FindBy(xpath="//span[@class='ajax_block_cart_total']")
   private WebElement camount;
    @FindBy(xpath="//a[@title='Proceed to checkout']")
    private WebElement clickcheckout;
    public AddedToCartModalPag(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public String camount(){
        String click=camount.getText();
        return click;
    }

    public Checkoutpage checkout() {
        clickcheckout.click();
        return new Checkoutpage(driver);
    }



    }
