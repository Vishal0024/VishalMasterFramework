package com.vishal.driver.factory.web.remote;

import com.vishal.enums.BrowserTypes;
import com.vishal.enums.RemoteMode;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){};

    public static WebDriver getDriver(RemoteMode remoteMode,BrowserTypes browserType ){
        WebDriver driver=null;
        if(remoteMode == RemoteMode.SELENIUM){
            driver = SeleniumGridFactory.getDriver(browserType);
        } else if(remoteMode == RemoteMode.SELENOID){
            driver = SelenoidFactory.getDriver(browserType);
        } else if (remoteMode == RemoteMode.BROWSER_STACK){
            driver = BrowserStackFactory.getDriver(browserType);
        }
        return driver;
    }
}
