package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * Test script to verify user is able to login to life360 account
 * steps:
 * 1.user should click on sign in button in home page
 * 2.user should enter phone number and password
 * 3.user should click on sign in button
 * excepted result:After entering ph number and password user should click on sign in button then user will logged in to life360 account
 *
 * @author Phanindra.k
 */

public class LoginTest extends BasetestNg {
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Before method");
    }
    @Test
    public void logintest(){
        Homepage h=new Homepage(driver);
        // This method is used to clik on signin button in home page
        h.signin();
        Login l=new Login(driver);
        //This method is used to enter phone numbers and password in login page
        l.enterphnumber("2085552666");
        l.enterpassword("life360#");
        // This method is used to click on sign in button after entering user details
        l.singin();
        Myaccount m=new Myaccount(driver);
        if(m.accdisplay()){
            System.out.println("Test passed user succesfully logged in account");
        }
        else{
            System.out.println("Test failed user not loggged in");
        }


        }

    }

