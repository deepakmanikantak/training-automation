package com.trainee.aizaz.selenium.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderTest2 extends BaseTestNg{
    @Test(dataProvider = "logindata")
    public void login(String uname,String pass) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(uname+"   "+pass);

    }

    @DataProvider(name="logindata",parallel = true)
    public Object[][] loginData() throws IOException {
        return readDataFromExcel();
    }
}
