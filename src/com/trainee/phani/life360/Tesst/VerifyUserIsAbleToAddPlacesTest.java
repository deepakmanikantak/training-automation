package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *  Test script to verify user able to add palces in there account
 * steps:
 * 1 user should sign in there life 360 account using ph number and password
 * 2 user will click on palces tab
 * 3 user will click on add palces tab
 * 4 user will enter name of the place
 * 5 user will clck on save button
 * expected result: place will added and page will be redirected to palces tab
 *
 * @author phani
 */

public class VerifyUserIsAbleToAddPlacesTest extends BasetestNg {
@BeforeMethod
public void Beforemethod(){
    System.out.println("Before method");
}
@Test(priority=0)
    public void addpalces(){
    Homepage h= new Homepage(driver);
    h.signin();
    Login l= new Login(driver);
    l.enterphnumber("2085552666");
    l.enterpassword("life360#");
    l.singin();
    Myaccount m= new Myaccount(driver);
    m.clikonpalces();
    m.addplaces();
    m.enterplacename("office");
    m.saveplace();
    if(m.verifyplaces()){
        System.out.println("Test case passed place added");
    } else {
        System.out.println("Test case failed ");
    }

}

}
