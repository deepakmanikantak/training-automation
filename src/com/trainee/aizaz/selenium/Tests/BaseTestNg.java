package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.GlobalVariables;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static com.trainee.aizaz.selenium.CommonStaticMethods.driverSelection;
public class BaseTestNg {
    WebDriver driver;
    @BeforeMethod
    public void initiateDriver() {
        driver = driverSelection(GlobalVariables.browserChrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
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