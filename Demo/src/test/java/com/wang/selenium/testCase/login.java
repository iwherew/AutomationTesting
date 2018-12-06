package com.wang.selenium.testCase;

import com.wang.selenium.base.DriverBase;
import com.wang.selenium.bussiness.LoginPro;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class login extends CaseBase {
    public DriverBase driver;
    public LoginPro loginpro;
    static Logger logger =  Logger.getLogger(login.class);
    public login() {
        this.driver = InitDriver("chrome");
        loginpro = new LoginPro(driver);
    }

    @Test
    public void getLoginHome(){
        driver.get("https://www.imooc.com");
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin() throws Exception {
        logger.debug("这个是log4j打印日志--------------------------------");
        loginpro.login("18767175519","123456789");
    }
}
