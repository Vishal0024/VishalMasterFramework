package com.vishal.tests.web;

import com.vishal.pages.LoginPage;
import com.vishal.pages.enums.topmenucomponent.Tier1MenuType;
import com.vishal.pages.enums.topmenucomponent.Tier2MenuType;
import com.vishal.pages.enums.topmenucomponent.Tier3MenuType;
import com.vishal.tests.WebBase;
import org.testng.annotations.Test;

public class demoTest1 extends WebBase {

    @Test
    public void testAddUsers() {
        new LoginPage().
                loginToApplication("Admin","admin123")
                .getTopMenuComponents()
                .clickTier1MenuItem(Tier1MenuType.ADMIN)
                .clickTier2MenuItem(Tier2MenuType.USER_MANAGEMENT)
                .clickTier3MenuItem(Tier3MenuType.USERS);

    }
}
