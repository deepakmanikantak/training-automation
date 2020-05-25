package Life360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The purpose of this class is to signUp for life360 application
 *
 * @author Geetanjali
 */
public class SignUp extends BasePage {
    private WebDriver driver;

    @FindBy(id="UserFirstName")
    private WebElement firstName;

    @FindBy(id="UserLastName")
    private WebElement lastName;

    @FindBy(id="UserEmail")
    private WebElement emailId;

    @FindBy(xpath="//li[@id=\"iti-item-us\"]/span[1]/../../../div")
    private WebElement country;

    @FindBy(id="mobile-number")
    private WebElement phoneNumber;

    @FindBy(id="UserPassword")
    private WebElement password;

    @FindBy(id="UserPasswordConfirm")
    private WebElement confirmPassword ;

    @FindBy(xpath="//input[@class='button']")
    private WebElement submit;

    public SignUp(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public SignUp enterFirstName(String userFirstName){
        firstName.sendKeys(userFirstName);
        return new SignUp(driver);
    }
    public SignUp enterLastName(String userLastName) {
        lastName.sendKeys(userLastName);
        return new SignUp(driver);
    }
    public SignUp enterValidEmail(String email) {
        emailId.sendKeys(email);
        return new SignUp(driver);
    }
    public SignUp selectCountry(String countryName) {
        country.click();
        return new SignUp(driver);
    }
        public SignUp enterPhoneNumber(String number) {
            phoneNumber.sendKeys(number);
            return new SignUp(driver);
        }
            public SignUp enterPassword(String passWord) {
                password.sendKeys(passWord);
                return new SignUp(driver);
            }
    public SignUp enterConfirmPassword(String confirmPassWord) {
        confirmPassword .sendKeys(confirmPassWord);
        return new SignUp(driver);
    }
    public ApplicationHomePage clickOnContinue() {
        submit.click();
        return new ApplicationHomePage(driver);
    }

}
