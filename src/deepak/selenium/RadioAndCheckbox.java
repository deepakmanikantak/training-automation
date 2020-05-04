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

public class RadioAndCheckbox {


    public static void main(String[] args) {


//         String chromeDriverPath = System.getProperty("user.dir")+"/drivers/chromedriver";
        String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver-81.exe";

        System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("http://automationpractice.com/index.php");

        WebElement radio = driver.findElement(By.xpath("//input[@value='Option 1']"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@value='checkbox1']"));

        // How do you check the functionality Radio
        // Difference between radio and check
        radio.click();
        boolean radiosISSelected = radio.isSelected();
        boolean checkboxsIselected = checkbox.isSelected();

        System.out.println(radiosISSelected +" "+ checkboxsIselected);






        // Quit the driver
        // driver.quit();
    }


}
