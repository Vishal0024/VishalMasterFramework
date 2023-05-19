package com.vishal.config;

import org.aeonbits.owner.ConfigCache;

public final class FrameworkConfigManager {

    private FrameworkConfigManager(){};

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
