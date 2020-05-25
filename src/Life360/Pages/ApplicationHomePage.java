package Life360.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * The purpose of this ApplicationHomePage class is to perform the actions to
 * SignIn and SignOut
 *
 */
public class ApplicationHomePage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(@class,'dropdown-toggle ng')]//i[contains(@class,'icon')]")
    WebElement myAccountOption;

    @FindBy(xpath = "//a[@ng-click='disconnect()']")
    WebElement signOut;

    @FindBy(xpath = "//button[contains(@class,'btn ng-binding ng-scope btn-warning')]")
    WebElement confirmSignOut;

    @FindBy(xpath = "//button[@ng-repeat='btn in buttons']")
    WebElement locationDataPopUp;

    public ApplicationHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public ApplicationHomePage clickOnAccountOption(){
        myAccountOption.click();
        return new ApplicationHomePage(driver);
    }

    public boolean myAccountDropDownSymbolIsDisplayed(){
      return   myAccountOption.isDisplayed();
    }
    public ApplicationHomePage clickOkOnLocationDataPopUp(){
        locationDataPopUp.click();
        return new ApplicationHomePage(driver);
    }

    public ApplicationHomePage clickOnSignOut(){
        signOut.click();
        return new ApplicationHomePage(driver);
    }

    public SignIn confirmSignOut(){
        confirmSignOut.click();
        return new SignIn(driver);
    }
}
