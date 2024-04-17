package com.ebay.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {

    static WebDriver driver;

    String browser;

    SelectHelper select;
    ItemHelper item;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.get("https://www.ebay.de");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        select = new SelectHelper(driver);
        item = new ItemHelper(driver);
       }

    public SelectHelper getSelect() {
        return select;
    }

    public ItemHelper getItem() {
        return item;
    }

    public void stop() {
        driver.quit();
    }
}
