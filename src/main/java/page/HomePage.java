package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage
{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@class='account']/span")
    private WebElement profileNameLabel;

    @FindBy(how = How.XPATH, using = "//a[@class='logout']")
    private WebElement logoutLink;

    public HomePage(WebDriver driver)       //Constructor to initialize the Class using WebDriver
    {
        this.driver = driver;
    }

    public String getLoggedInUsername()
    {
        return profileNameLabel.getText();
    }

    public void clickOnLoggoutLink()
    {
        logoutLink.click();
    }
}


