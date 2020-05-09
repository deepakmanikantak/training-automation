package com.trainee.aizaz.selenium.Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public static void maximizeAndImplicit(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * This method is alternate o @FindBy method
     * @param locator
     * @param text
     * @return
     */
    public  WebElement findElement(String locator, String text) {
        WebElement element = null;
        if (locator.equalsIgnoreCase("xpath")) {
            element = driver.findElement(By.xpath(text));

        } else if (locator.equalsIgnoreCase("id")) {
            element = driver.findElement((By.id(text)));

        } else if (locator.equalsIgnoreCase("className")) {
            element = driver.findElement((By.className(text)));

        } else if (locator.equalsIgnoreCase("name")) {
            element = driver.findElement((By.name(text)));
        }
        return element;
    }

    /**
     * method for JavaScriptExecutor:
     * @param element
     */
    public  void clickElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }

        //This method is to apply explicit wait till element is visible
        public  void visibilityOfElement(WebElement element){
            WebDriverWait explicitwait=new WebDriverWait(driver,20);
            explicitwait.until(ExpectedConditions.visibilityOf(element));
        }
        public Object[][] readDataFromExcel() throws IOException {
            File f=new File("src/com/trainee/aizaz/selenium/Tests/TestDataForSignIn.xlsx");
            FileInputStream fis=new FileInputStream(f);
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
            XSSFSheet sheet=workbook.getSheetAt(0);
            int rowCount=sheet.getLastRowNum();
            /**
             * Why i have taken i= starts from 1 is because at 0 row i have taken headings
             * fom row 1 the data  starts.
             */
            String  userName=null;
            String  passWord=null;
            for(int i=1;i<=rowCount;i++){
               userName=sheet.getRow(i).getCell(0).getStringCellValue();
               passWord=sheet.getRow(i).getCell(1).getStringCellValue();
            }
        return new Object[][]{
                {userName,passWord}
        };
        }
}
