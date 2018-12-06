package test;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {

    @Override
    public void onTestSuccess(ITestResult tr) {
        try {
            TestBase tb = (TestBase) tr.getInstance();
            WebDriver driver = tb.getDriver();
            System.out.println(driver.getTitle());
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("测试成功");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        try {
            TestBase tb = (TestBase) tr.getInstance();
            WebDriver driver = tb.getDriver();
            System.out.println(driver.getTitle());
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("测试失败");
    }

}