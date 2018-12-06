package com.wang.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver driverName(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.maroontte","D:\\software\\programme\\geckodriver-v0.23.0-win64\\geckodriver.exe");
            return new FirefoxDriver();
        }else{
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasee\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }
    }
}
