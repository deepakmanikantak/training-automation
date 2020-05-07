package com.trainee.aizaz.selenium.Tests;

import org.testng.annotations.Test;

import java.security.acl.Group;

public class GroupTestPractice1 {
    @Test(groups = {"regression"})
    public void m1() {
        System.out.println("This is regression group");
    }

    @Test(groups = {"smoke"})
    public void a1() {
        System.out.println("This is smoke test group");
    }

    @Test(groups = {"regression"})
    public void m2() {
        System.out.println("This is regression group");
    }
        @Test(groups = {"smoke"})
    public void a2(){
        System.out.println("This is smoke test group");
        }
}
