package deepak.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

     private WebDriver driver;


    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public CategoryPage clickOnWomens() {
        WebElement element = null;
        clickUsingJS(element);
        return new CategoryPage(driver);
    }

    public String getPageTitle() {
        return "";
    }

}
