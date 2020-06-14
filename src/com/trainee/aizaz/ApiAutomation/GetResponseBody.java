package com.trainee.aizaz.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

public class GetResponseBody {
    @Test
    public void getResponseBody() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Hyderabad");
        ResponseBody body = response.getBody();
        System.out.println("Response Body is: " + body.asString());
        //validation
        String body2 = body.asString();
        Assert.assertEquals(body2.toLowerCase().contains("hyderabad"), true, "it doesn't contain hyderabad");
        //or
        Assert.assertTrue(body2.toLowerCase().contains("hyderabad"), "it doesn't contain hyderabad");
    }

    @Test
    public void getResponseBodyValuesByJsonPathEvaluator() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Hyderabad");
        JsonPath jsonPathEvaluator = response.jsonPath();
        String city = jsonPathEvaluator.get("City");
        String city1 = response.getBody().jsonPath().get("City");
        System.out.println(city);
        System.out.println(city1);
        Assert.assertEquals(city, "Hyderabad", "Dosen't match");
    }
}


