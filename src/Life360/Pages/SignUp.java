package Life360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends BasePage {
    private WebDriver driver;
    @FindBy(id="UserFirstName")
    private WebElement firstName;
    @FindBy(id="UserLastName")
    private WebElement lastName;
    public SignUp(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

}
