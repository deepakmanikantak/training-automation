package com.trainee.aizaz.ApiAutomation;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendingPostData {
    @Test
    public void sendData(){
        RestAssured.baseURI="http://restapi.demoqa.com/customer";
        RequestSpecification httpRequest=RestAssured.given();
        JSONObject requestParameters=new JSONObject();
        requestParameters.put("FirstName", "Virender");
        requestParameters.put("LastName", "Singh");
        requestParameters.put("UserName", "sdimpleuser2dd2011");
        requestParameters.put("Password", "password1");
        requestParameters.put("Email",  "sample2ee26d9@gmail.com");
        httpRequest.body(requestParameters.toJSONString());
        Response response=httpRequest.request(Method.POST,"/register");
        int statusCode=response.getStatusCode();
        System.out.println(statusCode);
        JsonPath jsonPathEvaluator=response.jsonPath();
        String sucessCode=jsonPathEvaluator.get("SuccessCode");
        System.out.println(sucessCode);
        String responseBody=response.getBody().asString();
        System.out.println(responseBody);
        Assert.assertEquals(statusCode,200,"status not matched");
        Assert.assertEquals( "Correct Success code was returned", sucessCode, "not matching");
    }

    @Test
    public void RegistrationSuccessful()
    {
        RestAssured.baseURI ="http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "Virender"); // Cast
        requestParams.put("LastName", "Singh");
        requestParams.put("UserName", "sdimpleuser2dd2011");
        requestParams.put("Password", "password1");

        requestParams.put("Email",  "sample2ee26d9@gmail.com");
        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        String successCode = response.jsonPath().get("SuccessCode");
        System.out.println(successCode);
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
    }
}