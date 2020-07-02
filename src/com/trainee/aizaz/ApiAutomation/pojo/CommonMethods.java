package com.trainee.aizaz.ApiAutomation.pojo;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class CommonMethods {

    String baseUri = "http://samples.openweathermap.org/data/2.5";
    String weatherEndPoint = "/weather";

    public Response getWeatherResponse() {
        RestAssured.baseURI = baseUri;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject reqPara = new JSONObject();
        httpRequest.header("Content-Type","application/json");
        //Header key-value pair
       //reqPara.put("Content-Type", "application/json");
        //httpRequest.head(reqPara.toJSONString());
        Response response = httpRequest.queryParam("q", "London,UK")
                .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
                .request(Method.GET, weatherEndPoint);
        return response;
    }
}
