package Life360.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * The purpose of this class is to keep initialize driver
 */
public class DriverIntialization {
    public WebDriver driverIntilization(){
        String chromePath=System.getProperty("user.dir")+"/driver/chromedriver";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver",chromePath);
        WebDriver driver=new ChromeDriver();
        return driver;
    }
}
