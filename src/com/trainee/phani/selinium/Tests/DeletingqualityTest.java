package com.trainee.phani.selinium.Tests;

import com.trainee.phani.selinium.pages.AddedToCartModalPag;
import com.trainee.phani.selinium.pages.CategoryPage;
import com.trainee.phani.selinium.pages.Checkoutpage;
import com.trainee.phani.selinium.pages.Homepage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DeletingqualityTest extends Basetest {

    public static void main(String []args){
        DeletingqualityTest D=new DeletingqualityTest();
        WebDriver driver=D.driver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        Homepage h=new Homepage(driver);
        h.tshirts();
        CategoryPage c=new CategoryPage(driver);
        c.addProductToCart();
        AddedToCartModalPag a=new AddedToCartModalPag(driver);
        //String cartamount=a.camount();

        a.checkout();
        Checkoutpage ch=new Checkoutpage(driver);
        String amountbefore=ch.fianlamount();
        System.out.println("total amount before deleting "+amountbefore);
        ch.Qualitymin();
         System.out.println("fianl amount after delerting "+ch.fianlamount());

        if(amountbefore.equalsIgnoreCase(ch.fianlamount())) {
            System.out.println("test case failed");
        }else{
            System.out.println("test case pass");
        }


    }
}
