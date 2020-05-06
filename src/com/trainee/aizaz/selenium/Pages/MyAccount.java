package com.trainee.aizaz.selenium.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {
        private WebDriver driver;
        @FindBy(xpath = "//a[@title='Log me out']")
        private WebElement logout;
        @FindBy(xpath ="//a[@class='home']")
        private WebElement home;
        public MyAccount(WebDriver driver){
            super(driver);
            this.driver=driver;
        }
        public AuthenticationPage logout(){
            logout.click();
            return new AuthenticationPage(driver);
        }
        public HomePage returnHome(){
            home.click();
            return new HomePage(driver);
        }
}