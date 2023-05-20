package com.vishal.driver.entity;

import com.vishal.enums.MobilePlatform;
import com.vishal.enums.RemoteModeMobile;
import com.vishal.enums.RunMode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
    private RunMode runMode;
    private RemoteModeMobile remoteModeMobile;
    private MobilePlatform mobilePlatform;
}
