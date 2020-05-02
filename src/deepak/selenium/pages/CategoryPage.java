package deepak.selenium.pages;

import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {


    private WebDriver driver;

    public CategoryPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



    public AddedToCartModalPage addProductToCart(){
        //
        return new AddedToCartModalPage(driver);

    }

    public void selectColor(String colorname) {

    }

    public void enterEmail(String email){

    }

}
