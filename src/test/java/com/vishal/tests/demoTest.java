package com.vishal.tests;

import com.vishal.config.BrowserStackConfigManager;
import org.testng.annotations.Test;

public class demoTest extends webBase {

    @Test
    public void test2() throws InterruptedException {
        System.out.println(BrowserStackConfigManager.getConfig().browserStackURL());
    }
}
