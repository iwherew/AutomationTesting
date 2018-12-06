package com.wang.selenium.page;

import com.wang.selenium.base.DriverBase;
import com.wang.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class loginPage extends BasePage{
    public loginPage(DriverBase driver){
        super(driver);
    }

    /**
     * 获取用户名输入框element
     * */
    public WebElement getUserElement() throws Exception {
        return element(getByLocator.getLocator("username"));
    }


    /**
     * 获取密码输入框element
     * */
    public WebElement getPasswordElement() throws Exception {
        return element(getByLocator.getLocator("userpass"));
    }


    /**
     * 获取登陆按钮element
     * */
    public WebElement getLoginButtonElement() throws Exception {
        return element(getByLocator.getLocator("loginButton"));
    }


    /**
     * 获取自动登陆element
     * */
    public WebElement getAutoSigninElement() throws Exception {
        return element(getByLocator.getLocator("autoSignin"));
    }


}
