package com.trainee.aizaz.selenium.Tests;

import com.trainee.aizaz.selenium.Pages.BasePage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSingleDataFromExcel {
    public static void main(String[] args ) throws IOException {
        File src=new File("src/com/trainee/aizaz/selenium/Tests/TestDataForSignIn.xlsx");
        FileInputStream fi=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet sheet1=wb.getSheetAt(0);
        String userName= sheet1.getRow(0).getCell(0).getStringCellValue();
        String password=sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println(userName+"  "+password);

    }}
