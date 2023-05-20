package com.vishal.config;

import com.vishal.config.convertors.*;
import com.vishal.enums.BrowserTypes;
import com.vishal.enums.RemoteMode;
import com.vishal.enums.RemoteModeMobile;
import com.vishal.enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/java/resources/config.properties",
        "file:${user.dir}/src/test/java/resources/staging-config.properties",
        "file:${user.dir}/src/test/java/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserTypes browser();

    @Key("runMode")
    @ConverterClass(StringToRunModeConvertor.class)
    RunMode runMode();

    @Key("remoteMode")
    @ConverterClass(StringToRemoteModeConvertor.class)
    RemoteMode remoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeConvertor.class)
    RunMode runModeMobile();

    @Key("remoteModeMobile")
    @ConverterClass(StringToRemoteModeMobileConvertor.class)
    RemoteModeMobile remoteModeMobile();

    @ConverterClass(StringToURLConvertor.class)
    URL seleniumGridUrl();

    @ConverterClass(StringToURLConvertor.class)
    URL selenoidUrl();

    @ConverterClass(StringToURLConvertor.class)
    @DefaultValue("https://127.0.0.1:4723/wb/hub")
    URL localAppiumServerURL();
}
