package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShot {
    public WebDriver driver;

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    private void takeScreenshot(String screenPath) {
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        String curPath = System.getProperty("user.dir");
        path = path+".png";
        screenPath = curPath+"/"+path;
        try {
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            System.out.println("Screen shot error: " + screenPath);
        }
    }

    public void takeScreenshot() {
        String screenName = String.valueOf(new Date().getTime()) + ".jpg";
        File dir = new File("test-output/snapshot");
        if (!dir.exists())
            dir.mkdirs();
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.takeScreenshot(screenPath);
    }
}
