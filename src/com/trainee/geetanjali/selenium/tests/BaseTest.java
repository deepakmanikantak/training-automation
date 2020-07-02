package com.trainee.geetanjali.selenium.tests;


import com.trainee.geetanjali.selenium.pages.GlobalVariables;
import com.trainee.geetanjali.selenium.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

        private Driver driverClass = new  Driver();
        public WebDriver driver = driverClass.getDriver();



}


