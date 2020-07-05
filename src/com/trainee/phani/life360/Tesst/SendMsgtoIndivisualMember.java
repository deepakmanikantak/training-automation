package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import com.trainee.phani.life360.pages.Login;
import com.trainee.phani.life360.pages.Myaccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendMsgtoIndivisualMember extends BasetestNg {
    @BeforeMethod
    public void Beforemethod() {
        System.out.println("Bsefore method");
    }
@Test(priority=0)
    public void sendmsgtoindivisualmembers() {
        Homepage h = new Homepage(driver);
        h.signin();
        Login l = new Login(driver);
        l.enterphnumber("2085552666");
        l.enterpassword("life360#");
        l.singin();
        Myaccount m= new Myaccount(driver);
        m.clickonmessage();
        m.clickonmessagebar();
        m.clickonindivisualmemeber();

        m.entermessagetoall("indivisual");
        m.sendmessage();
        if(m.verifymsgsent()){
            System.out.println("message sent Testcase passed");
        }else
        {
            System.out.println("Test case failed");
        }
    }
}