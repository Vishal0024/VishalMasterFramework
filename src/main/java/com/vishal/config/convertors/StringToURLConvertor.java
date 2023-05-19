package com.vishal.config.convertors;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.URL;

public class StringToURLConvertor implements Converter<URL> {

    @SneakyThrows
    @Override
    public URL convert(Method method, String url) {
        return new URL(url);
    }
}
