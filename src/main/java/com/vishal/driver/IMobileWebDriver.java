package com.vishal.driver;

import com.vishal.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileWebDriver {
    WebDriver getDriver(MobileDriverData mobileDriverData);
}
