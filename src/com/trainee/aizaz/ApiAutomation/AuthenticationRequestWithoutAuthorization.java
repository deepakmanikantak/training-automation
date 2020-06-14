package com.trainee.aizaz.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import javax.servlet.RequestDispatcher;

public class AuthenticationRequestWithoutAuthorization {
    @Test
    public void requestWithoutAuthorizationHeader(){
        RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
        RequestSpecification httpRequest=RestAssured.given();
        Response res=httpRequest.get();
        System.out.println(res.statusCode());
        System.out.println("===================");
        System.out.println(res.getBody().asString());

    }
}
