package com.vishal.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.vishal.driver.Driver;

public class WebBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriverForWeb();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}
