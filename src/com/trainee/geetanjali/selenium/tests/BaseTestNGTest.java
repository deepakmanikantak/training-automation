package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.utils.Driver;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTestNGTest {
    WebDriver driver;

    @BeforeMethod
    public void driverInitiation(){
        //creating driver class object
        Driver d = new Driver();
        d.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        d.getDriver().manage().window().maximize();
        driver = d.getDriver();
        driver.get("http://automationpractice.com/index.php");
    }


    public Object[][] getSignInDataFromExcel(String excelSheetPath) throws IOException {
        File file = new File(excelSheetPath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        int numberOfRows = sheet.getLastRowNum();
        int numberOfColumns = row.getPhysicalNumberOfCells();
        String userName = null;
        String passWord = null;
        Object[][] data = new Object[numberOfRows+1][numberOfColumns];
        for (int i = 0; i <= numberOfRows; i++) {
            userName = sheet.getRow(i).getCell(0).getStringCellValue();
            passWord = sheet.getRow(i).getCell(1).getStringCellValue();
            System.out.println(userName);
            System.out.println(passWord);

            data[i][0] = userName;
            data[i][1] = passWord;
        }
        return data;
    }

}


