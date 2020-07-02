package com.trainee.aizaz.ApiAutomation;

import com.trainee.aizaz.ApiAutomation.pojo.CommonMethods;
import com.trainee.aizaz.ApiAutomation.pojo.WeatherResponseData;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment extends CommonMethods {
    @Test
    public void getData() {
        Response response = getWeatherResponse();
        int statusCode = response.getStatusCode();
        ResponseBody responsebody = response.getBody();
        System.out.println(statusCode);
        System.out.println(responsebody.asString());
        Assert.assertEquals(statusCode, 200, "status code not matching");
        if (statusCode == 200) {
            WeatherResponseData res = responsebody.as(WeatherResponseData.class);
            System.out.println(res.getCoord().getLon());
            System.out.println(res.getWeather().get(0).getId());
            Assert.assertEquals(res.getCoord().getLon(), -0.13, "Longitude Not Matching");
            int weatherId = res.getWeather().get(0).getId();
            Assert.assertEquals(weatherId, 300, "weather id not matching");
            Assert.assertEquals(res.getBase(), "stations", "base is not matching");
            Assert.assertEquals(res.getMain().getTemp(), 280.32, "temp is not matching");
            int visibility = res.getVisibility();
            Assert.assertEquals(visibility, 10000, "visibility is not matching ");
            Assert.assertEquals(res.getWind().getSpeed(), 4.1f, "Not matching");
            int all = res.getClouds().getAll();
            Assert.assertEquals(all, 90, "clouds-all values Not Matching");
            long dt = res.getDt();
            Assert.assertEquals(dt, 1485789600, "dt values not matching");
            int type = res.getSys().getType();
            Assert.assertEquals(type, 1, "type not matching");
            Assert.assertEquals(res.getName(), "London", "Name nogt matching");

        }
    }
}