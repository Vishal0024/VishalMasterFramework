package com.vishal.driver.impl.mobile;

import com.vishal.driver.IMobileWebDriver;
import com.vishal.driver.entity.MobileDriverData;
import com.vishal.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriveImpl implements IMobileWebDriver {

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return LocalMobileDriverFactory.getDriver(mobileDriverData.getMobilePlatform());
    }
}
