package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test case to verfify user is able to send message to group members in a circle
 * 1.user should click onsign in button in home page
 * 2.user should enter phone number and password
 * 3.user should click on sign in button
 * 4.user should click on message icon
 * 5.user should type message and click on send
 *  excepted result: Message should be sent to group members
 *
 * @author Phanindra.k
 */


public class sendmessagetoallmembersTest extends BasetestNg {
    @BeforeMethod
    public void  Beforemethod(){
        System.out.println("Before method");
    }
    @Test(priority = 0)
    public void sendmessagetoallmembers(){
        Homepage h = new Homepage(driver);
        // this method is used to clik on signin button in home page
        h.signin();
        Login l= new Login(driver);
        //this method is used to enter phone numbers and password in login page
        l.enterphnumber("2085552666");
        l.enterpassword("life360#");
        // this method is used to click on sign in button after entering user details
        l.singin();
        Myaccount m= new Myaccount(driver);
        // this method is used to click on message icon
        m.clickonmessage();
        // this method is used to click on message bar
        m.clickonmessagebar();
        // this method is used to type message
        m.entermessagetoall("autoamated");
        // this method is used to click on sent message button
        m.sendmessage();
        if(m.verifymsgsent()){
            System.out.println("message sent Testcase passed");
        }else
        {
            System.out.println("Test case failed");
        }
    }
}
