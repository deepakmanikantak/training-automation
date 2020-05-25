package Life360.Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    @FindBy(xpath = "//input[contains(@class,'phone-country')]")
    private WebElement stdCode;

    @FindBy(xpath = "//input[contains(@class,'phone-number')]")
    private WebElement phoneNo;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='btn login']")
    private WebElement loginButton;

    public SignIn(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public SignIn enterStdCode(String stdcode){
        stdCode.sendKeys(stdcode);
        return new SignIn(driver);
    }
    public SignIn enterMobileNo(String mobileNo){
        phoneNo.sendKeys(mobileNo);
        return new SignIn(driver);
    }
    public SignIn enterPassword(String pass){
        password.sendKeys(pass);
        return new SignIn(driver);
    }
    public SignIn clickOnLogin(){
       loginButton.click();
       return new SignIn(driver);
    }
    public boolean signInButtonIsVisible(){
       return loginButton.isDisplayed();
    }
    public SignUp clickOnRegisterToday(){
        registerToday.click();
    public SignUp clickOnRegister(){
        javaScriptExecutorToClick(registerToday);
        return new SignUp(driver);
    }
}