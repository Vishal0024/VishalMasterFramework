package com.vishal.driver.factory.web.local;

import com.vishal.driver.manager.web.local.ChromeManager;
import com.vishal.driver.manager.web.local.FirefoxManager;
import com.vishal.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    public static WebDriver getDriver(BrowserTypes browserType){
        WebDriver driver=null;

        return browserType == BrowserTypes.CHROME ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();
    }
}
