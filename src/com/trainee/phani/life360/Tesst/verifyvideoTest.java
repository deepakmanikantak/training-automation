package com.trainee.phani.life360.Tesst;

import com.trainee.phani.life360.pages.Homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyvideoTest  extends BasetestNg {
    @BeforeMethod
    public void Beforetest() {
        System.out.println("Before method");
    }

    @Test
    public void verifyvedio() throws InterruptedException {
        Homepage h = new Homepage(driver);
     ;
       JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        h.palyyoutube();
        Thread.sleep(5000);

       // h.closevideo();
            if (h.youtubedisplay()) {
                System.out.println("test case passed ");
            } else {
                System.out.println("Test case failed");
            }

        }
    }

