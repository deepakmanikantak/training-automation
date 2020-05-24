package Life360.Pages;
import org.openqa.selenium.WebDriver;

public class SignIn extends BasePage {
    private WebDriver driver;
    public SignIn(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}