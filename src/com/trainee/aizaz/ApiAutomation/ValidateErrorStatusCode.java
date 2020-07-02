package com.trainee.aizaz.ApiAutomation;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateErrorStatusCode {
    @Test
    public void errorStatusCodeValidate(){
        RestAssured.baseURI="https://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/8080");
        int statusCode=response.getStatusCode();
        Assert.assertNotEquals(statusCode,200,"Test failed---Both status code equal");
    }
}
