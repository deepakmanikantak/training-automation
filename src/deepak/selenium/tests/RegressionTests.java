package deepak.selenium.tests;

import deepak.selenium.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegressionTests {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Executing : beforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Executing : beforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Executing : beforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        //Create Driver Instance
        System.out.println("Executing : beforeMethod");
    }

    @Test(groups = {"smoke"})
    public void a(){
       //Start doing the validations
        String expectedResult = "MY Store";
        String actualResult = "Store" ;// homepage.getTitle();
        Assert.assertEquals(expectedResult,actualResult,"Page title is not matching");
        System.out.println("Executing : homePageTest");
     //   Assert.assertTrue(homepage.isLogoDisplayed(), "Home Page Logo is not displayed");
       // Assert.assertTrue( beforePrice > afterPrice, "Home Page Logo is not displayed");
    }

    @Test(groups = {"smoke"})
    public void b(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void d(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void c(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void e(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void cf(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void sds(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }

    @Test(groups = {"regression"})
    public void cdasdasd(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //throw new RuntimeException("Hell");
//        System.out.println("Executing : homePageNegativeScenarioTest");
    }



    @AfterMethod
    public void afterMethod(){
        // Quit the driver;
        System.out.println("Executing : AfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Executing : AfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Executing : AfterTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Executing : AfterSuite");
    }



}
