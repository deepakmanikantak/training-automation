package Life360.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * The purpose of this class is to click on register and navigate to the signUp page
 *
 * @author Geetanjali
 */
public class SignIn extends BasePage {
    private WebDriver driver;

    @FindBy(partialLinkText = "Register today!")
    private WebElement registerToday;

    public SignIn(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public SignUp clickOnRegister(){
        javaScriptExecutorToClick(registerToday);
        return new SignUp(driver);
    }
}