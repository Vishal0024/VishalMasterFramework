package com.vishal.config.convertors;

import java.lang.reflect.Method;

import com.vishal.enums.BrowserTypes;
import org.aeonbits.owner.Converter;

public class StringToBrowserTypeConvertor implements Converter<BrowserTypes> {

    @Override
    public BrowserTypes convert(Method method, String browserName) {
        return BrowserTypes.valueOf(browserName.toUpperCase());
    }
}
