package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class BaseHelper {

    AppiumDriver driver;

    public BaseHelper(AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        if (text != null) {
            tap(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
        //hide keyboard
        driver.navigate().back();
    }

    public void tap(By locator) {
        driver.findElement(locator).click();
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void swipe(double start, double stop) {
        Dimension size = driver.manage().window().getSize();
        //get x point
        int x = size.width / 2;
        //get y points
        int startY= (int) (size.height * start);
        int stopY = (int) (size.height * stop);
        //move to coordinates
        new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(x,startY))
                .moveTo(PointOption.point(x,stopY))
                .release().perform();
    }

    public void swipeByElement(By locator, double startPoint, double stopPoint) {
        Dimension size = driver.manage().window().getSize();

        //get activity points
        int y = (int) (size.height * startPoint);
        int y2 = (int) (size.height * stopPoint);

        //get locator's point
        WebElement element = driver.findElement(locator);
        int leftX = element.getLocation().getX();
        int rightX = leftX + element.getSize().getWidth();
        int middleX = (leftX + rightX)/2;

        new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(middleX,y))
                .moveTo(PointOption.point(middleX,y2))
                .release().perform();
    }

    public void tapWithCoordinates(int x, int y) {

        new TouchAction((PerformsTouchActions) driver).tap(PointOption.point(x,y))
                .release().perform();
    }
}
