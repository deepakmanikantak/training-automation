package com.trainee.aizaz.ApiAutomation.EndToEnd.Test;

import com.trainee.aizaz.ApiAutomation.EndToEnd.Pojo1.CustomerRequestData;
import com.trainee.aizaz.ApiAutomation.EndToEnd.Pojo1.EndPoints;
import com.trainee.aizaz.ApiAutomation.pojo.Sys;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BookTest extends EndPoints {
    @Test
    //415 error
    public void Registration(){
        CustomerRequestData c=new CustomerRequestData("aizaz","hello");
        Response response=getRegistartionResponse(c);
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),201,"status Not matches");
        /**
         * Instead of writing this here i have created method in EndPoints and called that
         * method
         * JsonPath jsonPathEvaluator=response.jsonPath();
         * String userId=jsonPathEvaluator.get("userID");
         * //or
         * String userId1=response.getBody().jsonPath().get("userID");**/
        String userId=getUserId();
    }

    @Test
    public void Token(){
        CustomerRequestData c=new CustomerRequestData("TOOLSQA-Test","Test@@123");
            Response response=generateTokenResponse(c);
            System.out.println(response.getBody().asString());
            String token=getToken();
            System.out.println(response.getStatusCode());
            Assert.assertEquals(response.getStatusCode(),200,"Status code not matching");
            Assert.assertTrue(response.getBody().asString().contains("token"));
    }

    @Test
    public void getBookId(){
        Response response=getBooksResponseForBookId();
        System.out.println(response.getBody().asString());

    }
}
