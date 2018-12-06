package com.wang.selenium.testCase;

import com.wang.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InitDriver(String browser){
         return new DriverBase(browser);
    }
}
