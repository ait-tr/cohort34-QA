package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.AddCarPage;
import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on OK button")
    public void click_on_OK_button() {
        new LoginPage(driver).clickOnOkButton();
    }

    @And("User clicks on Let the car work link")
    public void click_on_car_link() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User enters valid data about car")
    public void enter_car_data() {
        new AddCarPage(driver).enterCarData();
    }

    @And("User clicks on Submit button")
    public void click_on_Submit_button() {
        new AddCarPage(driver).submitCar();
    }

    @Then("User verifies message Car was added")
    public void verify_message_Car_was_added() {
        new AddCarPage(driver).successCarMessage("Car added");
    }

}
