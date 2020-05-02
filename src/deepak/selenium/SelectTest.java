package deepak.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectTest {
    public static void main(String[] args) {


//         String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";

        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


  //      driver.get("http://demo.guru99.com/test/newtours/register.php");

//
//        Select select = new Select(driver.findElement(By.xpath("country")));
//
//        //   select.selectByIndex(0);
//        select.selectByValue("ARGENTINA");

        driver.get("http://output.jsbin.com/osebed/2");
        Select select = new Select(driver.findElement(By.xpath("//select")));
        System.out.println(select.isMultiple());
        select.selectByIndex(0);
        select.selectByIndex(1);
        // Quit the driver
        // driver.quit();
    }

}
