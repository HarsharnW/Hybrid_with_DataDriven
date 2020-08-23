package test;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class TextBase
{
    protected static WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = DriverFactory.getDriver(BrowserType.CHROME);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}



