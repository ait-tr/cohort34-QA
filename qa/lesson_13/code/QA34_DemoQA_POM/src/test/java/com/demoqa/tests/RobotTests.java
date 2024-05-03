package com.demoqa.tests;

import com.demoqa.pages.DownloadPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class RobotTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectDownload();
    }

    @Test
    public void robotKeyEventsTests() throws AWTException {
        new DownloadPage(driver).hideIframes();
        new DownloadPage(driver).performKeyEventUsingRobot().getPath().contains("D1.txt.");
    }

    @Test
    public void robotMouseEventsTests() {
        new DownloadPage(driver).hideIframes();
        new DownloadPage(driver).performMouseEventUsingRobot().getPath().contains("D1.txt.");
    }
}
