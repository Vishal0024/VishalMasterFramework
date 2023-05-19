package com.vishal.driver;

import com.vishal.config.FrameworkConfigManager;
import com.vishal.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){}

    //Local : web test , mobile test
    //Remote: web test , mobile test

    public static WebDriver driver=null;
    public static void initDriver(){
        driver = LocalDriverFactory.getDriver(FrameworkConfigManager.getConfig().browser());
        driver.get("https://google.com");
    }

    public static void quitDriver(){
        driver.quit();
    }
}
