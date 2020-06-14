package com.trainee.aizaz.ApiAutomation.pojo;

public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public void setId(Integer id) {
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setMain(String main){
        this.main=main;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setIcon(String icon){
        this.icon=icon;
    }
    public String getIcon(){
        return icon;
    }
}
