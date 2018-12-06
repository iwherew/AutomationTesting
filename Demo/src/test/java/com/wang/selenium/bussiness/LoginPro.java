package com.wang.selenium.bussiness;

import com.wang.selenium.base.DriverBase;
import com.wang.selenium.handle.loginPageHandle;

public class LoginPro {
    public loginPageHandle lph;
    public LoginPro(DriverBase driver){
        lph = new loginPageHandle(driver);
    }

    public void login(String username,String password) throws Exception {

        if(lph.assertLoginPage()){
            lph.sendKeysUser(username);
            lph.sendKeysPassword(password);
            lph.clickAutoSignin();
            lph.clickLoginButton();
        }else{
            System.out.println("页面不存在或状态不正确");
        }
    }
}
