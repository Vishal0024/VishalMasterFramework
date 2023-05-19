package com.vishal.driver.factory.mobile.remote;

import com.vishal.driver.manager.mobile.remote.browserstack.BrowserStackAndroidManager;
import com.vishal.driver.manager.mobile.remote.browserstack.BrowserStackIosManager;
import com.vishal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

public final class BrowserStackMobileFactory {
    private BrowserStackMobileFactory(){};

    public static WebDriver getDriver(MobilePlatform mobilePlatform){
        WebDriver driver=null;
        return mobilePlatform == MobilePlatform.ANDROID ? BrowserStackAndroidManager.getDriver()
                : BrowserStackIosManager.getDriver();
    }
}
