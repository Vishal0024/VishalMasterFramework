package com.vishal.driver.factory.mobile.remote;

import com.vishal.enums.MobilePlatform;
import com.vishal.enums.RemoteModeMobile;
import org.openqa.selenium.WebDriver;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){};

    public static WebDriver getDriver(RemoteModeMobile remoteModeMobile, MobilePlatform mobilePlatform ){
        WebDriver driver=null;
        if(remoteModeMobile == RemoteModeMobile.BROWSER_STACK){
            driver = BrowserStackMobileFactory.getDriver(mobilePlatform);
        } else if(remoteModeMobile == RemoteModeMobile.SAUCE_LABS){
            //driver = SelenoidFactory.getDriver(browserType);
        }
        return driver;
    }
}
