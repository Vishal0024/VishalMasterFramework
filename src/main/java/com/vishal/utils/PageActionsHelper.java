package com.vishal.utils;

import com.vishal.driver.DriverManager;
import org.openqa.selenium.By;

public class PageActionsHelper {

    private PageActionsHelper(){}

    public static void waitAndClick(By by){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DriverManager.getDriver().findElement(by).click();
    }

    public static void waitAndSendKeys(By by,String text){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }
}
