package Life360.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * The purpose of this class is to write  the reusable methods and this class will
 * be extended by all the page classes
 *
 */
public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void javaScriptExecutorToClick(WebElement element) {
        JavascriptExecutor click = (JavascriptExecutor) driver;
        click.executeScript("arguments[0].click()", element);
    }
}
