package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Basepage;
import com.trainee.phani.life360.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyFbTwitterInstaLinkedTest extends BasetestNg {
    @BeforeMethod
    public static void Beforemethod(){
      System.out.println("Before method");
    }
    @Test
    public void verifyfacebook(){
        Homepage h= new Homepage(driver);
        h.clickonFB();
        Basepage b= new Basepage(driver);
        b.windowhandle(1);
        //orginal title for the fb life360 page
        String orginaltext="Life360 - Software - San Francisco, California - 125 Reviews - 381 Photos | Facebook";
        System.out.println(driver.getTitle());
        //title of the current page
        String actualtext=driver.getTitle();
        //verifying orginal and current tiles are same to know wheater the user redirected to expected page
        if(orginaltext.equalsIgnoreCase(actualtext)) {
            System.out.println("Test case passed user is on fb page ");
        }
            else{
                System.out.println("Test case failed");

            }
        }
    }

