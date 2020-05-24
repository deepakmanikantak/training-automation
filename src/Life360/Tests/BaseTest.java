package Life360.Tests;
import Life360.Utils.DriverIntialization;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
/**
 * This is the BaseTest class which will be extended by our test class. In this BaseTest we will be keeping methods
 * which are used in our test case and also we are keeping here @BeforeMethod
 * so that always before starting the test @Before method should get executed.
 */
public class BaseTest extends DriverIntialization {
    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver=driverIntilization();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.life360.com");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
