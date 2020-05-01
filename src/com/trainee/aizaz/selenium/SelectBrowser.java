package com.trainee.aizaz.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;
/**
 * this purpose of this program is selection of browser and open
 * website in the selected browser
 * @author aizaz
 */
public class SelectBrowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the option to select browser:");
        System.out.println("1.chrome 2.firefox");
        int n = sc.nextInt();
        WebDriver driver = null;
        switch (n) {
            case 1:
                String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
                System.out.println("ChromeDrive located At Path: " + chromeDriverPath);
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver = new ChromeDriver();

            case 2:
                String firefoxDriverPath = System.getProperty("user.dir") + "/drivers/geckodriver";
                System.out.println("firefox located At Path: " + firefoxDriverPath);
                System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
                driver = new FirefoxDriver();
        }
        driver.get("https://www.google.com");
        driver.quit();
    }
}
