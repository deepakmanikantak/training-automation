package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test case to create a new circle
 * steps:
 * 1.user able to login to theire life360 account using there account details
 * 2.user should click on add a circle tab
 * 3.user should be select on any one of the circle type
 * 4.user should be click on create a circle button
 * expected result:user able to craete a new circle
 *
 */

public class VerifyUserCreateNewCircleTest  extends BasetestNg{
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Beforemethod");
    }
    @Test(priority=0)
    public void verifyusercreatenewcircle(){
        Homepage h= new Homepage(driver);
        // This method is used to clik on signin button in home page
        h.signin();
        Login l = new Login(driver);
        //This method is used to enter phone numbers and password in login page
        l.enterphnumber("2085552666");
        l.enterpassword("life360#");
        // This method is used to click on sign in button after entering user details
        l.singin();
        Myaccount m= new Myaccount(driver);
        // this method is used to click on add circle tab
        m.addcircle();
        // this method is used to select circle type
        m.selectcircletype();
        // this method is used to click on create circle tab
        m.createcircle();
        if(m.verifycirclecreated()) {
            System.out.println("Test case passed circle created succesfully");
        } else{
            System.out.println("Test case failed");

            }
        }

        }




