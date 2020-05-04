package deepak.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

     private WebDriver driver;

     @FindBy(xpath = "//input")
     private WebElement womens;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        waitForElement(womens);
    }


    public CategoryPage clickOnWomens() {
        womens.click();
//        WebElement element = null;
//        clickUsingJS(element);
        return new CategoryPage(driver);
    }

    public String getPageTitle() {
        return "";
    }

}
