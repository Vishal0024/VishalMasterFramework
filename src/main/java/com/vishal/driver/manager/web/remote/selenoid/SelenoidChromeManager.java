package com.vishal.driver.manager.web.remote.selenoid;

import com.vishal.config.FrameworkConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidChromeManager {

    private SelenoidChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","chrome");
        cap.setCapability("browserVersion","112.0");
        cap.setCapability("enableVNC",true);
        cap.setCapability("enableVideo",false);
        return new RemoteWebDriver(FrameworkConfigManager.getConfig().selenoidUrl(),cap);
    }
}
