package Life360.Tests;
import Life360.Utils.DriverIntialization;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
/**
 * The purpose of this BaseTest class is the actions which are going to perform before every test execution
 * should be written in @BeforeMethod annotation and this class will be extended by all
 * the test classes.
 *
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
}
