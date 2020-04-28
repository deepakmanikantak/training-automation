package deepak.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This Class is for Opening the Driver
 *
 * @author deepak
 */
public class FirstWebDriverScript {

    public static void main(String[] args) {

        // Below property gives the path of the project location
        // For Mac : Please uncomment below property and comment windows path
         String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        //String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";

        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        // Perform the rest of the operations
        driver.get("https://www.life360.com");

        // Quit the driver
        // driver.quit();
    }
}
