package com.vishal.driver.factory.web.remote;

import com.vishal.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.vishal.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.vishal.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory(){};

    public static WebDriver getDriver(BrowserTypes browserType){
        WebDriver driver=null;
        return browserType == BrowserTypes.CHROME ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }
}
