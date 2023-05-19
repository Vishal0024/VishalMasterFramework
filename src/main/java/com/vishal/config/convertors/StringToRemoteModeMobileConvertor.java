package com.vishal.config.convertors;

import com.vishal.enums.RemoteModeMobile;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeMobileConvertor implements Converter<RemoteModeMobile> {

    @Override
    public RemoteModeMobile convert(Method method, String remoteModeMobile) {
        return RemoteModeMobile.valueOf(remoteModeMobile.toUpperCase());
    }
}
