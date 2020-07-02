package com.trainee.phani.selinium.Tests;

import com.trainee.phani.selinium.pages.Createaccountpage;
import com.trainee.phani.selinium.pages.Homepage;
import com.trainee.phani.selinium.pages.Login;
import javafx.scene.layout.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateaccountTest extends BaseTestNG {
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("before method");
    }
    @Test(priority = 0)
    public void createaccount(){
        Homepage h= new Homepage(driver);
        h.signin();
        Login l= new Login(driver);
       l.craeteaccount();
        Createaccountpage c= new Createaccountpage(driver);
        c.getgendermr();
        c.getfirstname("phanindra");
        c.getlastname("ksst");
        c.getpassword("phanindra123");
        c.getcheckboxnewsletter();
        c.getcheckboxoffers();
        c.getaddressfirstname("madhapur");
        c.getcompanyname("tachyon");
        c.getaddress1("madhapur1");
        c.getaddress2("madhapur2");
        c.getcity("Hyd");
        c.getpostalcode("55555");
        c.getother("abcdefghijk");
        c.gethomephone("9154142258");
        c.getphonemobile("8639995466");
        c.getmyaddress("Hyderabad");
        c.register();
    }
    @AfterMethod
    public void aftermethod(){
        driver.quit();
    }
}
