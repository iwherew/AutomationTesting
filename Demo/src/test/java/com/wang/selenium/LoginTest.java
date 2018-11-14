package com.wang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;


    public void InitDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasee\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }



    @Test(dependsOnMethods = {"InitDriver"})
    public void userLogin() throws Exception{
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("18767175519");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.className("xa-login")).click();
        driver.close();
    }

    /*public static void main(String[] args) throws Exception{
        LoginTest testLogin = new LoginTest();
        testLogin.InitDriver();
        testLogin.userLogin();
    }*/

}
