package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public String getSecondItemName(String secondItem) {
        return driver.findElement(By.cssSelector(".s-item:nth-child(" + secondItem + ") h3")).getText();
    }
}
