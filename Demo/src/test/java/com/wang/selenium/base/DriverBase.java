package com.wang.selenium.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import sun.util.resources.cldr.CalendarData;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;

public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }

    /**
     * 获取driver
     * */
    public WebDriver getDriver(){
        return driver;
    }

    public void stop(){
        System.out.println("stop webdriver");
        driver.close();
    }

    /**
    * 封装Element方法
    * */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    /**
     * 自动截图
     * */
    public void takeScreenShot() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String dateStr = sf.format(date);
        String path = this.getClass().getSimpleName()+"_"+dateStr+".png";
        takeScreenShot((TakesScreenshot)this.getDriver(),path);
    }


    /**
     * 传入参数截图
     * */
    public void takeScreenShot(TakesScreenshot drivername,String path){
        String currentPath = System.getProperty("user.dir");
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,new File(currentPath+"\\"+path));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("截图成功");
        }

    }


    /**
     * get封装
     * */
    public void get(String url){
        driver.get(url);
    }

}
