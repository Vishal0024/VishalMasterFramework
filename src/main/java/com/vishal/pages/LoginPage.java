package com.vishal.pages;

import org.openqa.selenium.By;
import static com.vishal.utils.PageActionsHelper.*;

public class LoginPage {

    private static final By USER_NAME_TEXT_BOX = By.name("username");
    private static final By PASSWORD_TEXT_BOX = By.name("password");
    private static final By LOGIN_BUTTON = By.cssSelector(".orangehrm-login-button");

    private LoginPage setUsernameTextBox(String userName){
        waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
        return this;
    }

    private LoginPage setPasswordTextBox(String password){
        waitAndSendKeys(PASSWORD_TEXT_BOX,password);
        return this;
    }

    private HomePage setLoginButton(){
        waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }

    public HomePage loginToApplication(String username,String password){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return setUsernameTextBox(username)
                .setPasswordTextBox(password)
                .setLoginButton();
    }
}
