package com.trainee.geetanjali.selenium.tests;

import com.trainee.geetanjali.selenium.utils.Driver;
import org.openqa.selenium.WebDriver;

public class BaseTest {
        private Driver driverClass = new  Driver();
        public WebDriver driver = driverClass.getDriver();



    }

