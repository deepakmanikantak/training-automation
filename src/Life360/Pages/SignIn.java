package Life360.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends BasePage {
    private WebDriver driver;
    @FindBy(partialLinkText = "Register today!")
    private WebElement registerToday;
    public SignIn(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public SignUp clickOnRegisterToday(){
        registerToday.click();
        return new SignUp(driver);
    }
}