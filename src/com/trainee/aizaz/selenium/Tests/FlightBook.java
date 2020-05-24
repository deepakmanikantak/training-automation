package com.trainee.aizaz.selenium.Tests;
import com.trainee.aizaz.selenium.PagesOfFlightBook.BookingConfirmationPage;
import com.trainee.aizaz.selenium.PagesOfFlightBook.HomePage;
import com.trainee.aizaz.selenium.PagesOfFlightBook.RegistrationSucessPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FlightBook extends BaseTestNgFlight {
    @Test(priority = 1)
    public void regsitration() {
        HomePage hp = new HomePage(driver);
        hp.clickOnRegister().setFirstName("aizaz").setLastName("ahmed").setPhoneNo("80005").setEmailId("aizaz1@gmal.com")
                .setAddress("james road").setCity("chicago").setState("illinios").setPostalCode("00000")
                .setUserName("aizaz").setPassWord("hello").confirmPassword("hello").clickOnSubmit();
        RegistrationSucessPage rsp = new RegistrationSucessPage(driver);
        /**checking whether after regestering we are able to see register logo or not to ensure registration
         *is successful
         */
        Assert.assertTrue(rsp.registerLogoFound(), "register success logo not found after submit");
        rsp.clickOnHome();
    }

    @Test(priority = 2)
    public void signInAndBooking() {
        HomePage hp = new HomePage(driver);
        hp.enterUserName("aizaz").enterPassword("hello").login().bookingType("roundtrip").noOfPassengers(0)
                .setDepartLocation("London").setDepartMonth("5").setDepartDay("10").setArrivingLocation("New York")
                .setReturnMonth("6").setReturnDay("7").selectClass("first class").clickOnContinue()
                .continueToBookFlightPage().setpassengerFirstName("aizaz").setpassengerLasttName("ahmed")
                .setCreditCardNo("12345").cardExpiryMonth("01").cardExpiryYear("2010").setFirstNameOfCardHolder("alan")
                .setMiddleNameOfCardHolder("johnson").setLastNameOfCardHolder("morries").clickOnSecurePurchase();
        //checking whether booking confirmation message is displayed or not after final submission
        BookingConfirmationPage bcp = new BookingConfirmationPage(driver);
        Assert.assertTrue(bcp.bookingConfirmationMessageIsDisplayed());
        bcp.logOut();


    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}