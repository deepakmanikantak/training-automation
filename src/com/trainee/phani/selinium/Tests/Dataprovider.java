package com.trainee.phani.selinium.Tests;

import com.trainee.phani.selinium.pages.Homepage;
import com.trainee.phani.selinium.pages.Login;
import com.trainee.phani.selinium.pages.Personalinfo;
import com.trainee.phani.selinium.pages.Youraccount;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Dataprovider extends BaseTestNG {
   /** @Test(dataProvider="logindata")
    public void login(String username,String password) throws InterruptedException{
        Homepage h = new Homepage(driver);
        h.signin();
        Login l = new Login(driver);
        l.getusername(username);
        l.getpassword(password);
        l.Signin();
        Youraccount y = new Youraccount(driver);
        String getmailid=y.clickpersonalinfo().verifyaccount();
        Assert.assertEquals(username,getmailid,"user not signrd in to correct account");
        Personalinfo p=new Personalinfo(driver);
        p.signout();
        Login l1=new Login(driver);
        Assert.assertTrue(l.displaysigin(),"you re not loggedout from your account");
    }
        @DataProvider(name="logindata", parallel=false)
       public Object[][]logindata() throws IOException {
        Object[][]data=getdatafromexcel("src\\com\\trainee\\phani\\selinium\\Tests\\Untitled spreadsheet.xlsx");
        return data;


    }}

        **/}