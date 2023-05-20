package com.vishal.driver;

import com.vishal.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData webDriverData);
}
