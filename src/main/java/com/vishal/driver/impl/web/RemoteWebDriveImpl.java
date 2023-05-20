package com.vishal.driver.impl.web;

import com.vishal.driver.IWebDriver;
import com.vishal.driver.entity.WebDriverData;
import com.vishal.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriveImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return RemoteDriverFactory.getDriver(webDriverData.getRemoteMode(), webDriverData.getBrowserType());
    }
}
