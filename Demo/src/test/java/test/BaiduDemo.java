package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestngListener.class})
public class BaiduDemo {
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasee\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        TestngListener.driver = driver;
        driver.get("http://www.baidu.com");
        WebElement searchInputEle = driver.findElement(By.id("kw"));
        searchInputEle.clear();
        searchInputEle.sendKeys("testngListener");
        driver.findElement(By.id("su")).click();
        driver.quit();
    }

}
