package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test case to verify user able to change the
 */

public class UpdatephnumberTest extends BasetestNg {
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Before method");
    }
    @Test
    public void updatephnumber(){
        Homepage h= new Homepage(driver);
        h.signin();
        Login l= new Login(driver);
        l.enterphnumber("2085552666");
        l.enterpassword("life360#");
        l.singin();
        Myaccount m= new Myaccount(driver);
        m.profilepic();
        m.account();
        m.updatephonumber("2085552666");
        m.clickonaccountsave();
        if(m.verifyaccountupdated()) {
            System.out.println("Test case passed account updated");
        }
        else{
            System.out.println("Test case failed");
        }



        }
    }

