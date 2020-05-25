package Life360.Pages;

import org.openqa.selenium.WebDriver;

public class ApplicationHomePage extends BasePage  {
    private WebDriver driver;
    public ApplicationHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
