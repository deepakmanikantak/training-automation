package com.trainee.aizaz.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QueryParameters {
    @Test
    public void sendQueryParameters(){
        RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.queryParam("q", "London,UK")
                .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
                .request(Method.GET,"/weather");
        int statusCode=response.getStatusCode();
        String jsonString=response.asString();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(jsonString.contains("London"), true);
    }
}
