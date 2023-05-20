package com.vishal.pages;

import com.vishal.pages.pagecomponents.homepage.TopMenuComponents;

public class HomePage {

    private TopMenuComponents topMenuComponents;

    public HomePage(){
        this.topMenuComponents = new TopMenuComponents();
    }

    public TopMenuComponents getTopMenuComponents(){
        return topMenuComponents;
    }
}
