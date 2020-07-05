package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Basepage;
import com.trainee.phani.life360.pages.Download;
import com.trainee.phani.life360.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Verifynewtabopendownlaodbutton extends BasetestNg{
    @BeforeMethod
    public void Beforetest() {
        System.out.println("Before method");
    }
    @Test
    public void downloadopeninnewtab(){
        Homepage h= new Homepage(driver);
         h.clickdownload();
        Download d = new Download(driver);
       //to get count of no of tabs opened
        int size=driver.getWindowHandles().size();
        System.out.println(size);
        //orginal page title
        String title="Life360 : Sign Up for Life360";
        Basepage b= new Basepage(driver);
        b.windowhandle(1);
        //getting newly opened page title
        String actualtitle=driver.getTitle();
       System.out.println(actualtitle);
       //verifying whether new tab opned correct page or not
       if(title.equalsIgnoreCase(actualtitle)&&size==2) {
           System.out.println("Testcase passed");
       }
                   else{
                       System.out.println("test case failed");
           }
       }

    }

