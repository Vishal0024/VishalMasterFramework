package com.vishal.driver;

import com.vishal.config.FrameworkConfig;
import com.vishal.config.FrameworkConfigManager;
import com.vishal.driver.entity.MobileDriverData;
import com.vishal.driver.entity.WebDriverData;
import com.vishal.driver.factory.DriverFactory;
import com.vishal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.vishal.config.FrameworkConfigManager.getConfig;

public final class Driver {

    public static WebDriver driver;

    //Local : web test , mobile test
    //Remote: web test , mobile test

    private Driver() {
    }

    public static void initDriverForWeb() {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData webDriverData = new WebDriverData
                    (getConfig().browser(), getConfig().runMode(), getConfig().remoteMode());

            driver = DriverFactory.getDriverForWeb(webDriverData);
            DriverManager.setDriver(driver);
            loadURL();
        }
    }

    public static void initDriverForMobile() {
        MobileDriverData mobileDriverData = new MobileDriverData
                (getConfig().runMode(), getConfig().remoteModeMobile(), MobilePlatform.ANDROID);

        driver = DriverFactory.getDriverForMobile(mobileDriverData);
        DriverManager.setDriver(driver);
    }

    public static void loadURL(){
        DriverManager.getDriver().get(FrameworkConfigManager.getConfig().webUrl());
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
