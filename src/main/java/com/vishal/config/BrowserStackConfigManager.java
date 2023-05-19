package com.vishal.config;

import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigManager {

    private BrowserStackConfigManager(){};

    public static BrowserStackConfig getConfig(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
