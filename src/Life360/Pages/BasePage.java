package Life360.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * In this class we will be keeping all the common methods which are required in all the page classes.
 * This class will be extended by all the Page classes.
 */
public class BasePage {
    WebDriver driver;
    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}