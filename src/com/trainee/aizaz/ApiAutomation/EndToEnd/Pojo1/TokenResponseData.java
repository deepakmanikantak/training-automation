package com.trainee.aizaz.ApiAutomation.EndToEnd.Pojo1;

public class TokenResponseData {
private String token;
private String expires;
private String status;
private String result;

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires() {
        return expires;
    }

    public String getResult() {
        return result;
    }

    public String getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }
}
