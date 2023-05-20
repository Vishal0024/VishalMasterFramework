package com.vishal.driver.factory;

import com.vishal.driver.impl.mobile.LocalMobileDriveImpl;
import com.vishal.driver.impl.web.LocalWebDriveImpl;
import com.vishal.driver.impl.mobile.RemoteMobileDriveImpl;
import com.vishal.driver.impl.web.RemoteWebDriveImpl;
import com.vishal.driver.entity.MobileDriverData;
import com.vishal.driver.entity.WebDriverData;
import com.vishal.enums.RunMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getDriverForWeb(WebDriverData webDriverData) {
        return webDriverData.getRunMode() == RunMode.LOCAL
                ? new LocalWebDriveImpl().getDriver(webDriverData)
                : new RemoteWebDriveImpl().getDriver(webDriverData);
    }

    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData) {
        return mobileDriverData.getRunMode() == RunMode.LOCAL
                ? new LocalMobileDriveImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriveImpl().getDriver(mobileDriverData);
    }
}