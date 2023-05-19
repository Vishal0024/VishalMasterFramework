package com.vishal.driver.manager.web.remote.selenoid;

import com.vishal.config.FrameworkConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidFirefoxManager {

    private SelenoidFirefoxManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","firefox");
        cap.setCapability("browserVersion","latest");
        cap.setCapability("enableVNC",true);
        cap.setCapability("enableVideo",false);
        return new RemoteWebDriver(FrameworkConfigManager.getConfig().selenoidUrl(),cap);
    }
}
