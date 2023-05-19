package com.vishal.driver.factory.web.remote;

import com.vishal.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.vishal.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.vishal.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory(){};

    public static WebDriver getDriver(BrowserTypes browserType) {
        WebDriver driver = null;
        return browserType == BrowserTypes.CHROME ? SelenoidChromeManager.getDriver()
                :SelenoidFirefoxManager.getDriver();
    }
}
