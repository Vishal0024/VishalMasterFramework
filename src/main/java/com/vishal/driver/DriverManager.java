package com.vishal.driver;

import com.vishal.enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public final class DriverManager {
    private DriverManager(){}

    private static ThreadLocal<WebDriver> WEB_THREAD_LOCAL = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> MOBILE_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<PlatformType> CONTEXT = ThreadLocal.withInitial(()-> PlatformType.WEB);
    private static final Map<PlatformType,ThreadLocal<WebDriver>> DRIVER_MAP =
            new EnumMap<>(PlatformType.class);

    public static WebDriver getDriver() {
        return CONTEXT.get() == PlatformType.WEB
                ? WEB_THREAD_LOCAL.get()
                : MOBILE_THREAD_LOCAL.get();
    }

    public static void setDriver(WebDriver driver){
        if(driver instanceof AndroidDriver || driver instanceof IOSDriver) {
            MOBILE_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(PlatformType.MOBILE,MOBILE_THREAD_LOCAL);
            CONTEXT.set(PlatformType.MOBILE);
        } else {
            WEB_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(PlatformType.WEB,WEB_THREAD_LOCAL);
            CONTEXT.set(PlatformType.WEB);
        }
    }

    public static void unload(){
        WEB_THREAD_LOCAL.remove();
        MOBILE_THREAD_LOCAL.remove();
        CONTEXT.remove();
    }
}
