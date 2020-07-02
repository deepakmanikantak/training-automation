package deepak.selenium.tests;

import org.testng.annotations.Test;

public class DataProvider {


    @Test(dataProvider = "logindata")
    public void checkLoginFunction(String username, String password) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Executing : with "+username +" and  "+ password);
    }

    @org.testng.annotations.DataProvider(name = "logindata" , parallel = true)
    public Object[][] loginData(){

        return new Object[][] {
                {"deepak1","password"}, {"phani1","passowrd"}, {"aziz1","password"}, {"geetanjali1","passowrd"},
                {"deepak2","password"}, {"phani2","passowrd"}, {"aziz2","password"}, {"geetanjali2","passowrd"},
                {"deepak3","password"}, {"phani3","passowrd"}, {"aziz3","password"}, {"geetanjali3","passowrd"},
                {"deepak4","password"}, {"phani4","passowrd"}, {"aziz4","password"}, {"geetanjali4","passowrd"},
                {"deepak5","password"}, {"phani5","passowrd"}, {"aziz5","password"}, {"geetanjali5","passowrd"},
                {"deepak6","password"}, {"phani6","passowrd"}, {"aziz6","password"}, {"geetanjali6","passowrd"},
                {"deepak7","password"}, {"phani7","passowrd"}, {"aziz7","password"}, {"geetanjali7","passowrd"} };
    }



}
