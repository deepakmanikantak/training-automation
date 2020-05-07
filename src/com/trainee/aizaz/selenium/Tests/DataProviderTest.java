package com.trainee.aizaz.selenium.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "logindata")
    public void login(String username,String password) throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("username="+username+"password="+password);
    }

    @DataProvider(name="logindata",parallel = true)
    public Object[][] logindata(){
        return new Object[][]{
                {"aizaz1","password"},{"alan1","password"},{"walker1","password"},
                {"aizaz2","password"},{"alan2","password"},{"walker2","password"},
                {"aizaz3","password"},{"alan3","password"},{"walker3","password"},
        };
    }
}
