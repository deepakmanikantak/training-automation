package com.trainee.aizaz.ApiAutomation;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetResponseTest {
    @Test
    public void getResponse(){
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/Hyderabad");
        String responseBody=response.getBody().asString();
        String statusLine=response.getStatusLine();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(200,statusCode,"status code not matching test failed");
        System.out.println(responseBody+"\n\n");
        System.out.println("=========================================");
        System.out.println(statusLine);

        System.out.println("=========================================");
        System.out.println("=========================================");

        Response response2=httpRequest.get("/pune");
        String responseBody2=response2.getBody().asString();
        String statusLine2=response2.getStatusLine();
        int statusCode2=response.getStatusCode();
        Assert.assertEquals(200,statusCode2,"status code not matching test failed");
        System.out.println(responseBody2+"\n\n");
        System.out.println("=========================================");
        System.out.println(statusLine2);
    }
}