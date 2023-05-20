package com.vishal.driver.entity;

import com.vishal.enums.BrowserTypes;
import com.vishal.enums.RemoteMode;
import com.vishal.enums.RunMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {

    private BrowserTypes BrowserType;
    private RunMode runMode;
    private RemoteMode remoteMode;
}
