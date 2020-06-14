package com.trainee.aizaz.ApiAutomation;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetHeaders {
    @Test
    public void getHeaderIndividually() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/hyderabad");
        String contentType=response.getHeader("Content-Type");
        System.out.println(contentType);
        Assert.assertEquals(contentType,"application/json","the content type is not equal");
        String serverType=response.getHeader("Server");
        System.out.println(serverType);
        Assert.assertEquals(serverType,"nginx/1.12.1","server type is not eaual");
        String acceptLanguage = response.header("Content-Encoding");
        System.out.println( acceptLanguage);
        Assert.assertEquals(acceptLanguage,"gzip","accept language is not equal");
    }
    @Test
    public void getHeadersInGroup(){
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/Hyderabad");
        Headers allheaders=response.getHeaders();
        Headers allheaders2=response.headers();
        for(Header header:allheaders){
            System.out.println(header.getName()+"="+header.getValue());
        }
        System.out.println("========================================");
        for(Header header:allheaders2){
            System.out.println(header.getName()+"="+header.getValue());
        }
    }
}