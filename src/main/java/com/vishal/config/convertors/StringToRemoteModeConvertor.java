package com.vishal.config.convertors;

import java.lang.reflect.Method;

import com.vishal.enums.RemoteMode;
import org.aeonbits.owner.Converter;

public class StringToRemoteModeConvertor implements Converter<RemoteMode> {

    @Override
    public RemoteMode convert(Method method, String remoteMode) {
        return RemoteMode.valueOf(remoteMode.toUpperCase());
    }
}

