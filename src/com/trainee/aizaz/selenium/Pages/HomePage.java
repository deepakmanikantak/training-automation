package com.trainee.aizaz.selenium.Pages;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement women;

    @FindBy(xpath = "//a[@title='Women']/..//a[@title='T-shirts']")
    private WebElement tshirt;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement signin;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CategoryPage clickOnTshirts() {
      //the purpose of keeping this is to show difference b/w finElement and @FindBy
       /* WebElement women = null;
        WebElement tshirt = null;
        women = findElement(GlobalVariables.xpath, "//a[@title='Women']");
        tshirt = findElement(GlobalVariables.xpath, "//a[@title='Women']/..//a[@title='T-shirts']");*/

        Actions action = new Actions(driver);
        action.moveToElement(women).click(tshirt).build().perform();
        return new CategoryPage(driver);
    }

    public AuthenticationPage clickOnSignIn() {
        signin.click();
        return new AuthenticationPage(driver);
    }
}