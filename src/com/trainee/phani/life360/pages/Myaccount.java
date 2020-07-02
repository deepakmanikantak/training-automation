package com.trainee.phani.life360.pages;

import com.trainee.phani.selinium.pages.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount extends Basepage {
     private WebDriver driver;
     @FindBy(xpath="//*[@id='google-map']/div/div[1]")
     private WebElement accdisplay;
     @FindBy(xpath="//*[@id='main']/div[4]/ul/li[2]/a")
     private WebElement message;
     @FindBy(xpath="//*[@id=\"circle-messages\"]/div[2]/form/div/span[2]/img")
     private WebElement clickonindivisualmemeber;
     @FindBy(xpath="//*[@id='circle-messages']/div[2]/form/textarea")
     private WebElement clickonmessagebar;
     @FindBy(xpath="//*[@id='circle-messages']/div[2]/form/textarea")
     private WebElement entermessage;
     @FindBy(xpath="//*[@id='circle-messages']/div[2]/form/button")
     private WebElement sendmessage;
     @FindBy(xpath="//*[@id='circle-messages']/div[2]")
     private WebElement verifymessagesent;
     @FindBy(xpath="//*[@id='main']/div[4]/ul/li[3]/a")
     private WebElement places;
     @FindBy(xpath="//*[@id='places']/ul/li[1]/h5")
     private WebElement addplaces;
     @FindBy(xpath="//input[@class='input-place controls ng-pristine ng-valid']")
     private WebElement enterplacename;
     @FindBy(xpath="//*[@id='ng-app']/div[3]/div/div/div/div[4]/span/button")
     private WebElement saveplace;
     @FindBy(xpath="//*[@id='ng-app']/div[3]/div/div/div/div[4]/button")
     private WebElement close;
     @FindBy(xpath = "//*[@id='places']")
     private WebElement verifyplaces;
     @FindBy(xpath="//*[@id='main']/div[4]/ul/li[5]/a")
     private WebElement addcircle;
     @FindBy(xpath="//*[@id='addmember']/div/div[1]/div[1]/div[2]/p")
     private WebElement selectcircletype;
     @FindBy(xpath="//*[@id='addmember']/div/div[2]/button")
     private WebElement clickoncraetecircle;
     @FindBy(xpath="//*[@id='main']/div[4]/div/div[5]/div/div/div")
     private WebElement verifycirclecreated;
     @FindBy(xpath="//*[@id='main']/div[2]/div/div/user/div/a")
     private WebElement profilepic;
     @FindBy(xpath="//*[@id='main']/div[2]/div/div/user/div/ul/li[1]/a")
     private WebElement account;
     @FindBy(xpath="//*[@id='ng-app']/div[3]/div/div/div/form/div/div[6]/div/div/input")
     private WebElement updatephnumber;
     @FindBy(xpath="//*[@id='ng-app']/div[3]/div/div/div/form/div/button")
     private WebElement clickonaccountsave;
     @FindBy(xpath="//*[@id='ng-app']/div[3]/div/div/div/div[1]")
     private WebElement verifyaccountupdated;
    public Myaccount(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public Boolean accdisplay(){
        Boolean display=accdisplay.isDisplayed();
        return display;
    }
    public void clickonmessage(){
        message.click();
    }
    public void clickonmessagebar()
    {
        explicitWait(driver,clickonmessagebar);
        clickonmessagebar.click();
    }
    public void clickonindivisualmemeber(){
        javaScriptExecute(clickonindivisualmemeber);
    }
    public void entermessagetoall(String element){

        entermessage.sendKeys(element);
    }
    public void sendmessage() {
        sendmessage.click();
    }
    public Boolean verifymsgsent(){
        Boolean msg=verifymessagesent.isDisplayed();
        return msg;
    }
    public void clikonpalces(){
        places.click();
    }
    public void addplaces(){
        addplaces.click();
    }
    public void enterplacename(String element){
        enterplacename.sendKeys(element);
    }
    public void saveplace(){
        javaScriptExecute(saveplace);
    }
    public void closeplace(){
        close.click();
    }
    public Boolean  verifyplaces(){
        Boolean verify= verifyplaces.isDisplayed();
        return verify;
    }
    public void addcircle(){
        addcircle.click();
    }
    public void selectcircletype(){
        explicitWait(driver,selectcircletype);
        selectcircletype.click();
    }
    public void createcircle(){
        javaScriptExecute(clickoncraetecircle);
    }
    public Boolean verifycirclecreated(){
        explicitWait(driver,verifycirclecreated);
        Boolean verify=verifycirclecreated.isDisplayed();
        return verify;
    }
    public void profilepic(){
        profilepic.click();
    }
    public void account(){
        account.click();
    }
    public void updatephonumber(String phnumber){
        for(int i=0; i<=2;i++){
            try{
                updatephnumber.sendKeys(phnumber);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void clickonaccountsave(){
        javaScriptExecute(clickonaccountsave);

    }

   public Boolean verifyaccountupdated(){
        explicitWait(driver,verifyaccountupdated);

            return verifyaccountupdated.isDisplayed();
   }




}
