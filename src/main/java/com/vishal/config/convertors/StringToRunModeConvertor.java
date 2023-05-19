package com.vishal.config.convertors;

import com.vishal.enums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeConvertor implements Converter<RunMode> {

    @Override
    public RunMode convert(Method method, String runMode) {
        return RunMode.valueOf(runMode.toUpperCase());
    }
}
