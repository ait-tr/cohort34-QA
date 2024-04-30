package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class SearchSteps {

    @And("User enters city")
    public void enter_city(){
        new HomePage(driver).enterCity("Tel Aviv");
    }
    @And("User enters dates")
    public void enter_dates(){
        new HomePage(driver).enterPeriod("4/30/2024 - 5/30/2024");
    }
    @And("User clicks on search button")
    public void click_on_search_button(){
        new HomePage(driver).clickOnYalla();
    }
    @Then("User verifies search results are displayed")
    public void verify_search_result(){
        new HomePage(driver).isSearchResultDisplayed();
    }
}
