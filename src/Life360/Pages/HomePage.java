package Life360.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}