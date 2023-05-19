package com.vishal.driver.manager.web.remote.selenium;

import com.vishal.config.FrameworkConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(Browser.CHROME.browserName());
        return new RemoteWebDriver(FrameworkConfigManager.getConfig().seleniumGridUrl(),cap);
    }
}
