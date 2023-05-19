package com.vishal.driver.manager.web.remote.browserstack;

import com.vishal.config.BrowserStackConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackFirefoxManager {

    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser","firefox");
        cap.setCapability("browser_version","latest");
        cap.setCapability("os","Windows");
        cap.setCapability("os_version","10");
        return new RemoteWebDriver(BrowserStackConfigManager.getConfig().browserStackURL(),cap);
    }
}
