package com.wang.selenium.testCase;

import com.wang.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class testCourseList extends CaseBase {
    public DriverBase driver;
    public testCourseList(){
        this.driver = InitDriver("chrome");
    }

    @Test
    public void CourseList() throws InterruptedException {
        driver.get("https://coding.imooc.com/");
        driver.maximize();
        List<String> listString = this.listElement();
        for(int i=0;i<listString.size();i++){
//            Thread.sleep(500);
            driver.findElement(By.className("imv2-close")).click();
            driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")).click();
            driver.back();
        }
    }

    /**
     * 获取所有课程的list
     * */
    public List<String> listElement(){
        List<String> listString = new ArrayList<String>();
        WebElement element = driver.findElement(By.className("shizhan-course-list"));
        List<WebElement> listElement = element.findElements(By.className("shizhan-intro-box"));
        for(WebElement el : listElement){
            listString.add(el.findElement(By.className("shizan-desc")).getText().split(" ")[0]);
        }
        return listString;
    }
}











