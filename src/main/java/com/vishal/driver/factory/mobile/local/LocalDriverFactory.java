package com.vishal.driver.factory.mobile.local;

import com.vishal.driver.manager.mobile.local.AndroidManager;
import com.vishal.driver.manager.mobile.local.IosManager;
import com.vishal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    public static WebDriver getDriver(MobilePlatform mobilePlatform){
        WebDriver driver=null;

        return mobilePlatform == MobilePlatform.ANDROID ? AndroidManager.getDriver()
                : IosManager.getDriver();
    }
}
