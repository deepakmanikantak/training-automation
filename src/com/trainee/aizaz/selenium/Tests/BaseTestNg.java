package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import static com.trainee.aizaz.selenium.CommonStaticMethods.driverSelection;

public class BaseTestNg {
    WebDriver driver;
    @BeforeMethod
    public void initiateDriver() {
        driver = driverSelection(GlobalVariables.browserChrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}