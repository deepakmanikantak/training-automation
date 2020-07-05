package com.trainee.phani.selinium.Tests;

import com.sun.rowset.internal.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTestNG {
    WebDriver driver;

    @BeforeMethod

    public void driverinitiation() {
        Basetest b = new Basetest();
        driver = b.driver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

  /**  public Object[][] getdatafromexcel(String filepath) throws IOException {
        File f = new File(filepath);
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        int rowcount = sheet.getLastRowNum();
        int coloumncount = row.getPhysicalNumberOfCells();
        System.out.println(rowcount);
        System.out.println(coloumncount);
        String username = null;
        String password = null;
        Object[][] data = new Object[rowcount + 1][coloumncount];
        for (int i = 0; i <= coloumncount; i++) {
            username = sheet.getRow(i).getCell(0).getStringCellValue();
            password = sheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(username);
            System.out.println(password);
            data[i][0] = username;
            data[i][1] = password;
        }
        return data;

    }**/
}