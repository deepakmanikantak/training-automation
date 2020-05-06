package deepak.selenium.tests;

import deepak.selenium.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestTestNG {

    WebDriver driver;

    @BeforeMethod
    public void initiateDRiver() {
        Driver d = new Driver();
        d.getDriver().manage().window().maximize();
        d.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        d.getDriver().get("");
        driver = d.getDriver();
    }
}
