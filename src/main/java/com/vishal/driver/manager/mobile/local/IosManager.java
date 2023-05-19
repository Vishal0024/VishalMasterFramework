package com.vishal.driver.manager.mobile.local;

import com.vishal.config.FrameworkConfigManager;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IosManager {

    private IosManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
        cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/ios-app.zip");
        return new RemoteWebDriver(FrameworkConfigManager.getConfig().localAppiumServerURL(),cap);
    }
}
