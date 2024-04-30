package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement rentCarLink;

    public HomePage clickOnLetTheCarWorkLink() {
        pause(2000);
        click(rentCarLink);
        return this;
    }

    @FindBy(id = "city")
    WebElement citySelect;


    public HomePage enterCity(String city) {
        citySelect.sendKeys(city);
        pause(1000);
        citySelect.sendKeys(Keys.DOWN);
        pause(1000);
        citySelect.sendKeys(Keys.ENTER);
        pause(1000);
        return this;
    }

    @FindBy(id = "dates")
    WebElement dateInput;

    public HomePage enterPeriod(String period) {
        click(dateInput);
        String os = System.getProperty("os.name");
        if (os.startsWith("Mac")) {
            dateInput.sendKeys(Keys.COMMAND, "a");

        } else {
            dateInput.sendKeys(Keys.CONTROL, "a");
        }
        dateInput.sendKeys(period);
        dateInput.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yalla;

    public HomePage clickOnYalla() {
        click(yalla);
        return this;
    }

    @FindBy(className = "cars-container")
    WebElement cars;

    public HomePage isSearchResultDisplayed() {
        assert isElementDisplayed(cars);
        return this;
    }
}
