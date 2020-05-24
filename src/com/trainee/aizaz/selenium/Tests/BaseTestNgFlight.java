package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static com.trainee.aizaz.selenium.CommonStaticMethods.driverSelection;

public class BaseTestNgFlight {
    WebDriver driver;

    @BeforeMethod
    public void initiateDriver() {
        driver = driverSelection(GlobalVariables.browserChrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
    }

    /**
     * This method is used to read the data from the excel sheet
     *
     * @return
     * @throws IOException
     */
    public Object[][] getDataFromExcel(String url) throws IOException {
        File f = new File(url);
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        int rowCount = sheet.getLastRowNum();
        int columnCount = row.getPhysicalNumberOfCells();
        System.out.println(rowCount);
        System.out.println(columnCount);
        String userName = null;
        String passWord = null;
        Object[][] data = new Object[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            userName = sheet.getRow(i + 1).getCell(0).getStringCellValue();
            passWord = sheet.getRow(i + 1).getCell(1).getStringCellValue();
            data[i][0] = userName;
            data[i][1] = passWord;
        }
        return data;
    }
}