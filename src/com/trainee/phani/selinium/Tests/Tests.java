package com.trainee.phani.selinium.Tests;


import com.trainee.phani.selinium.pages.AddedToCartModalPag;
import com.trainee.phani.selinium.pages.CategoryPage;
import com.trainee.phani.selinium.pages.Checkoutpage;
import com.trainee.phani.selinium.pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests extends BaseTestNG {
    WebDriver driver;
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Before method");
    }
  /**  @Test(priority = 0)
    public void getitleTest(){
        Tests t=new Tests();
        Homepage h=new Homepage(driver);
        String title="My Store";
         String orginaltitle=h.gettile();
        if(orginaltitle.equalsIgnoreCase(title)) {
            System.out.println("failed");
        }else{
                System.out.println("pass");
            }
        }**/
        @Test(priority = 0)
        public void Testcase2() {
            Homepage h = new Homepage(driver);
            h.tshirts();
            CategoryPage c = new CategoryPage(driver);
            c.addProductToCart();
            AddedToCartModalPag a = new AddedToCartModalPag(driver);
            a.checkout();
            Checkoutpage ch = new Checkoutpage(driver);
            String amountbefore = ch.fianlamount();
            System.out.println("amount before deleting " + amountbefore);

            ch.Qualitymin();
            String amountafter = ch.fianlamount();
            System.out.println("fianl amount after delerting " + amountafter);

            if (amountbefore.equalsIgnoreCase(amountafter)) {
                System.out.println("test case failed");
            } else {
                System.out.println("test case pass");
            }
        }

     @AfterMethod

        public void close(){
            System.out.println("After method");
            driver.quit();
     }

    }

