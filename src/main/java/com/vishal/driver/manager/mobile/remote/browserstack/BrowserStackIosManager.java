package com.vishal.driver.manager.mobile.remote.browserstack;

import com.vishal.config.BrowserStackConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIosManager {

    private BrowserStackIosManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("device","Any Ios device name");
        cap.setCapability("os_version","9.0");
        cap.setCapability("project","FirstProject");
        cap.setCapability("build","first build");
        return new RemoteWebDriver(BrowserStackConfigManager.getConfig().browserStackURL(),cap);
    }
}
