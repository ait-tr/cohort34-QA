package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCarPage extends BasePage{

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

   public void enterCarData() {
        enterLocation("Tel Aviv, Israel");
        enterManufacture("Audi");
        enterModel("A7");
        enterYear("2024");
        enterFuel("Diesel");
        enterSeats("5");
        enterClass("Limousin");
        enterSerialNumber("12-34-996");
        enterPrice("750");
        enterAboutData("It`s a good new car!");
    }

    @FindBy(id = "pickUpPlace")
    WebElement location;

    public AddCarPage enterLocation(String city) {
        type(location, city);
        pause(1000);
        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufactureField;

    public AddCarPage enterManufacture(String manufacture) {
        type(manufactureField, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelField;

    public AddCarPage enterModel(String model) {
        type(modelField, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearField;

    public AddCarPage enterYear(String year) {
        type(yearField, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelField;

    public AddCarPage enterFuel(String fuel) {
        Select select = new Select(fuelField);
        select.selectByVisibleText(fuel);
        return this;
    }

    @FindBy(id = "seats")
    WebElement seatsField;

    public AddCarPage enterSeats(String seats) {
        type(seatsField, seats);
        return this;
    }

    @FindBy(id = "class")
    WebElement classField;

    public AddCarPage enterClass(String classAuto) {
        type(classField, classAuto);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumberField;

    public AddCarPage enterSerialNumber(String serialNumber) {
        type(serialNumberField, serialNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement priceField;

    public AddCarPage enterPrice(String price) {
        type(priceField, price);
        return this;
    }

    @FindBy(id = "about")
    WebElement aboutField;

    public AddCarPage enterAboutData(String aboutData) {
        type(aboutField, aboutData);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;

    public AddCarPage submitCar() {
        click(submitButton);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement submitMessage;

    public AddCarPage successCarMessage(String message) {
        assert submitMessage.getText().contains(message);
        return this;
    }

}
