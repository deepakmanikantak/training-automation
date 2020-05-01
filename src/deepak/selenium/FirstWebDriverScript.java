package deepak.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * This Class is for Opening the Driver
 *
 * @author deepak
 */
public class FirstWebDriverScript {

    public static void main(String[] args) {

        // Below property gives the path of the project location
        // For Mac : Please uncomment below property and comment windows path
//         String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";

        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // Perform the rest of the operations
      //  driver.get("https://www.life360.com");

        driver.get("http://automationpractice.com/index.php");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // SCoroll to the element
        // We cna directly click using the JAvascript executor

        // JS -> Remote Webdriver -extended in Crhomedirver

        WebElement addtocart = driver.findElement(By.xpath("//ul[@id='homefeatured']//a[@title='Add to cart']"));
        String s = addtocart.getText();

        JavascriptExecutor js = (JavascriptExecutor) driver;




        WebDriverWait explicitwait = new WebDriverWait(driver, 90);
        explicitwait.until(ExpectedConditions.visibilityOf(addtocart));
        WebDriverWait explicitwai3 = new WebDriverWait(driver, 90);


        js.executeScript("window.scrollBy(0,600)");
        addtocart.click();
        js.executeScript("arguments[0].click()", addtocart);
        // What are this waits and Why do we use .. What if we are not using it ?
        // -> Implicit wwaits ->
        // -> Explicit waits ->
        // Fluent Wait -->
        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(600)).
                        pollingEvery(Duration.ofSeconds(180)).ignoring(NoSuchElementException.class);

      //Homepage -> Tops
        // CAtegory -> Product

        // Quit the driver
        // driver.quit();
    }
}
