package com.trainee.aizaz.selenium.Tests;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSetOfDataFromExcelTest {
    public static void main(String[] args) throws IOException {
        File f=new File("src/com/trainee/aizaz/selenium/Tests/TestDataForSignIn.xlsx");
        FileInputStream fis=new FileInputStream(f);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheetAt(0);
    int rowCount=sheet.getLastRowNum();
        /**
         * Why i have taken i= starts from 1 is because at 0 row i have taken headings
         * fom row 1 the data  starts.
         */
    for(int i=1;i<=rowCount;i++){
        String userName=sheet.getRow(i).getCell(0).getStringCellValue();
        String passWord=sheet.getRow(i).getCell(1).getStringCellValue();
        System.out.println(userName+"    "+passWord);
    }
    }
}