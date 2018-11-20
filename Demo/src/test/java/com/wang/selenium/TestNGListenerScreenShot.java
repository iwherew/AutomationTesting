package com.wang.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class TestNGListenerScreenShot extends TestListenerAdapter {
    WebDriver driver;

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        takeScreenShot();
    }

    /*private void takeScreenShot(ITestResult tr) {
        baseDriver b = (baseDriver) tr.getInstance();
        b.takeScreenShot();
    }*/

    /*
     截图
     */
    public void takeScreenShot(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasee\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        String curPath = System.getProperty("user.dir");
        path = path+".png";
        String screenPath = curPath+"/"+path;
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
    }

    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
    }

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
    }


}
