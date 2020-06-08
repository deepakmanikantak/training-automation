package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import com.trainee.phani.life360.pages.Signup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** Test script to verify user is able to login to life360 account
 * steps:
 * 1.user should click on sign in button in home page
 * 2.user should enter phone number and password
 * 3.user should click on sign in button
 * excepted result:After entering ph number and password user should clickn on sign in button then user will logged in to life360 account
 *
 */

public class SignupTest extends BasetestNg{
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Before method");
    }
    @Test(priority = 0)
    public void checksignup(){
        Homepage h= new Homepage(driver);
        h.signin();
        Login l= new Login(driver);
        l.signup();
        Signup s= new Signup(driver);
        s.getfirstname("phanindra");
        s.getlastname("ksst");
        s.getemailid("pkota+2664@life360.com");
        s.getmobilenumber("+12085552677");
        s.getpassword("life360#");
        s.getconfirmpassword("life360#");
        s.submit();
        Myaccount m= new Myaccount(driver);
        if(m.accdisplay()){
            System.out.println("succesfully account craeted and user logged in Test case passed");
        }
        else{
            System.out.println("Test case failed");
        }

    }
}
