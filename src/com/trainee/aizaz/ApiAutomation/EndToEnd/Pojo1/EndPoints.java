package com.trainee.aizaz.ApiAutomation.EndToEnd.Pojo1;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.codehaus.groovy.syntax.Token;
import org.json.simple.JSONObject;

public class EndPoints {

    private String userName="TOOLSQA-Test";
    private String passWord="Test@@123";
    private String baseUrl="http://bookstore.toolsqa.com";
    private String registraionEndPoint="/Account/v1/User";
    private String generateTokenEndPoint="/Account/v1/GenerateToken";
    private String booksEndPoint="/BookStore/v1/Books";


    public Response getRegistartionResponse(CustomerRequestData customerRequestData){
        RestAssured.baseURI=baseUrl;
        RequestSpecification httpRequest=RestAssured.given();
        //SENDING USERNAME AND PASSWORD IN REQUEST BODY:
        JSONObject reqParameter=new JSONObject();
        httpRequest.body(customerRequestData);
        httpRequest.post("/Accoutn/v1/Gen");
        reqParameter.put("UserName", userName);
        reqParameter.put("Password", passWord);
        httpRequest.body(reqParameter.toJSONString());
        Response response=httpRequest.request(Method.POST,registraionEndPoint);
        return response;
    }

    public String getUserId(){
        CustomerRequestData crd=new CustomerRequestData("aizaz","aizaz");
        String userId=getRegistartionResponse(crd).getBody().jsonPath().get("userID");
        return userId;
    }
    public Response generateTokenResponse(CustomerRequestData crd){
        RestAssured.baseURI=baseUrl;
        RequestSpecification httpRequest=RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        /**JSONObject reqPara=new JSONObject();
        reqPara.put("UserName", userName);
        reqPara.put("Password", passWord);**/
        httpRequest.body(crd);
        Response response=httpRequest.request(Method.POST,generateTokenEndPoint);
        return response;
    }
    public String getToken(){
        CustomerRequestData crd=new CustomerRequestData("aizaz ","aizaz");
        ResponseBody body=generateTokenResponse(crd).getBody();
        TokenResponseData bodyRes=body.as(TokenResponseData.class);
        String token=bodyRes.getToken();
        return token;
    }
    public Response getBooksResponseForBookId(){
        RestAssured.baseURI=baseUrl;
        RequestSpecification httpRequest=RestAssured.given();
        Response response = httpRequest.request(Method.GET,booksEndPoint);
        return response;
    }
}
