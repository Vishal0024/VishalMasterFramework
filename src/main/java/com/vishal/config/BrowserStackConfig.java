package com.vishal.config;

import com.vishal.config.convertors.StringToURLConvertor;
import org.aeonbits.owner.Config;
import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/java/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {

    String username();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConvertor.class)
    URL browserStackURL();
}
