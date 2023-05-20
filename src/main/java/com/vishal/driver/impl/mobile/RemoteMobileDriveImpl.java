package com.vishal.driver.impl.mobile;

import com.vishal.driver.IMobileWebDriver;
import com.vishal.driver.entity.MobileDriverData;
import com.vishal.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriveImpl implements IMobileWebDriver {

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return RemoteMobileDriverFactory.getDriver(mobileDriverData.getRemoteModeMobile(), mobileDriverData.getMobilePlatform());
    }
}
