package com.vishal.pages.pagecomponents.homepage;

import com.vishal.pages.enums.topmenucomponent.Tier1MenuType;
import com.vishal.pages.enums.topmenucomponent.Tier2MenuType;
import com.vishal.pages.enums.topmenucomponent.Tier3MenuType;
import org.openqa.selenium.By;

import static com.vishal.utils.PageActionsHelper.waitAndClick;

public class TopMenuComponents {

    private static final String TIER1_MENU = "//span[text()='%s']/parent::a";
    private static final String TIER2_MENU = "//span[text()='%s']/parent::li";
    private static final String TIER3_MENU = "//a[text()='%s']";

    public TopMenuComponents clickTier1MenuItem(Tier1MenuType menuType) {
        waitAndClick(By.xpath(String.format(TIER1_MENU, menuType.getName())));
        return this;
    }

    public TopMenuComponents clickTier2MenuItem(Tier2MenuType subMenuType) {
        waitAndClick(By.xpath(String.format(TIER2_MENU, subMenuType.getName())));
        return this;
    }

    public void clickTier3MenuItem(Tier3MenuType subMenuType) {
        waitAndClick(By.xpath(String.format(TIER3_MENU, subMenuType.getName())));
    }
}
