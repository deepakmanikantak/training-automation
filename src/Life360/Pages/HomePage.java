package Life360.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath="//a[@class='button']")
    private WebElement signInClick;
    public SignIn clickOnSignIn() {
        signInClick.click();
        return new SignIn(driver);
    }
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}