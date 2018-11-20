package test;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {

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
    }

}