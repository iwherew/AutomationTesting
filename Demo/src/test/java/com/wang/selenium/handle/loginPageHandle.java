package com.wang.selenium.handle;


import com.wang.selenium.base.DriverBase;
import com.wang.selenium.page.loginPage;

public class loginPageHandle {
     public DriverBase driver;
     public loginPage lp;
     public loginPageHandle(DriverBase driver){
         this.driver = driver;
         lp = new loginPage(driver);
     }
     /**
      * 输入用户名
      * */
     public void sendKeysUser(String username) throws Exception {
         lp.sendKeys(lp.getUserElement(),username);
     }

     /**
      * 输入密码
      * */
     public void sendKeysPassword(String password) throws Exception {
         lp.sendKeys(lp.getPasswordElement(),password);
     }

     /**
      * 点击登陆
      * */
     public void clickLoginButton() throws Exception {
         lp.click(lp.getLoginButtonElement());
     }

     /**
      * 点击自动登陆
      * */
     public void clickAutoSignin() throws Exception {
         lp.click(lp.getAutoSigninElement());
     }

     /**
      * 判断是否是登陆页面
      * */
     public boolean assertLoginPage() throws Exception {
         return lp.assertElementIs(lp.getUserElement());
     }
}
