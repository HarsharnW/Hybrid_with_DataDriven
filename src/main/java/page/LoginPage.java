package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = "//p[@class='submit']//span[1]")
    private WebElement signInButton;

    public void setEmail(String email)
    {
        emailTextBox.sendKeys(email);
    }

    public void setPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    public void clickOnSignInButton()
    {
        signInButton.click();
    }


}
