package util;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

public class DriverManager
{
    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        return DriverFactory.getDriver(BrowserType.CHROME);
    }
}
