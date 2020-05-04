package deepak.selenium.tests;

import deepak.selenium.pages.HomePage;
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

    @Test
    public void a(){
       //Start doing the validations
        System.out.println("Executing : homePageTest");
    }

    @Test
    public void b(){
        throw new RuntimeException("Hell");
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
