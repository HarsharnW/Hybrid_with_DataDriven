package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import util.ExcelReader;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends TextBase
{
    private static final String filePath = "UserDetails.xlsx";
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void before()
    {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }


    @Test
    public void verifyValidLogin()
    {
        for (int i=1; i<=2; i++)
        {
            loginPage.setEmail(ExcelReader.read(filePath,i,0));
            loginPage.setPassword(ExcelReader.read(filePath,i,1));
            loginPage.clickOnSignInButton();

            assertEquals(homePage.getLoggedInUsername(),ExcelReader.read(filePath,i,2));
            homePage.clickOnLoggoutLink();
        }
    }
}




