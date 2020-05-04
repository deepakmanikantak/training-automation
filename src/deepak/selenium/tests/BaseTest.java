package deepak.selenium.tests;

import deepak.selenium.utils.Driver;
import org.openqa.selenium.WebDriver;


public class BaseTest {

    private Driver driverClass = new  Driver();
    public WebDriver driver = driverClass.getDriver();

}
