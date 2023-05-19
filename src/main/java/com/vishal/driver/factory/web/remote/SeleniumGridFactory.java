package com.vishal.driver.factory.web.remote;

import com.vishal.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.vishal.driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import com.vishal.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){};

    public static WebDriver getDriver(BrowserTypes browserType){
        WebDriver driver=null;
        return browserType == BrowserTypes.CHROME ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFireFoxManager.getDriver();
    }
}
