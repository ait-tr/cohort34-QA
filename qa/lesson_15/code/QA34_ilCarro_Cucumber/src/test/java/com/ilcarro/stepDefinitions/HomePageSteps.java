package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilCarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome browser")
    public void launch_Chrome_browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilCarro HomePage")
    public void open_HomePage() {
        new HomePage(driver).openUrl();
    }

    @Then("User verifies HomePage title is displayed")
    public void verify_HomePage_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }

    @And("User quites browser")
    public void quit_browser() {
        new HomePage(driver).quite();
    }
}
