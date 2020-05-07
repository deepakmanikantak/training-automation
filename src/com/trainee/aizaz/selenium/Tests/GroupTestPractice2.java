package com.trainee.aizaz.selenium.Tests;

import org.testng.annotations.Test;

public class GroupTestPractice2 {
    @Test(groups = "smoke")
    public void a1(){
        System.out.println("this is smoke test group-2");

    }
    @Test(groups = "regression")
            public void m1(){
        System.out.println("this is regression group-2");

            }
    @Test(groups = "smoke")
    public void a2(){
        System.out.println("this is smoke test group-2");

    }
    @Test(groups = "regression")
    public void m2(){
        System.out.println("this is regression group-2");

    }
}
