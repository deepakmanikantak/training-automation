package deepak.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsTest {
    public static void main(String[] args) {


//         String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";

        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("http://automationpractice.com/index.php");

        WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

        WebElement womenTshirts = driver.findElement(By.xpath("//a[@title='Women']/..//a[@title='T-shirts']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(women).click(womenTshirts).build().perform();

        // ANy Keynoard Operantions - > Combination of Keys -->
        actions.keyDown(Keys.CONTROL).keyUp(Keys.TAB).release();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()", womenTshirts);


     //   womenTshirts.click();






        // Quit the driver
        // driver.quit();
    }



}
