package com.trainee.phani.selinium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage{
    private WebDriver driver;
    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tshirtsclick;
    @FindBy(xpath="//a[@class='login']")
    private WebElement signin;

    public Homepage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public CategoryPage tshirts() {

        tshirtsclick.click();
         return new CategoryPage(driver);

    }
    public String gettile(){
        String orignaltitle=driver.getTitle();
        return orignaltitle;
    }
    public Login signin(){
        signin.click();
        return new Login(driver);

    }
}
