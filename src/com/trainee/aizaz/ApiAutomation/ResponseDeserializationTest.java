package com.trainee.aizaz.ApiAutomation;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ResponseDeserializationTest {
    @Test
    public void deserializeResponseBody(){
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
       ResponseBody responseBody=response.getBody();
        System.out.println(responseBody.asString());
        System.out.println("==========================================");
        if(statusCode==200){
            ResponseBodyVariablesDeserialization res=responseBody.as(ResponseBodyVariablesDeserialization.class);
            System.out.println(res.FaultId);
            System.out.println(res.fault);
            Assert.assertEquals("User already exists",res.FaultId);
            Assert.assertEquals("FAULT_USER_ALREADY_EXISTS",res.fault);
        }
        else if(statusCode==201){
            ResponseBodyVariablesDeserialization res=responseBody.as(ResponseBodyVariablesDeserialization.class);
            System.out.println(res.Message);
            System.out.println(res.SuccessCode);
            Assert.assertEquals("OPERATION_SUCCESS", res.SuccessCode);
            Assert.assertEquals("Operation completed successfully", res.Message);
        }
    }
}