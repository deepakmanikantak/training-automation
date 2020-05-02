package deepak.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void  clickUsingJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }
}
