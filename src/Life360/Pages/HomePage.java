package Life360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The purpose of this class is to click on signIn and navigate to SignIn page.
 *
 */
public class HomePage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@class='button']")
    private WebElement signInClick;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SignIn clickOnSignIn() {
        signInClick.click();
        return new SignIn(driver);
    }

}