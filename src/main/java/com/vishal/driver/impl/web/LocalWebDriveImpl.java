package com.vishal.driver.impl.web;

import com.vishal.driver.IWebDriver;
import com.vishal.driver.entity.WebDriverData;
import com.vishal.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriveImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return LocalDriverFactory.getDriver(webDriverData.getBrowserType());
    }
}
