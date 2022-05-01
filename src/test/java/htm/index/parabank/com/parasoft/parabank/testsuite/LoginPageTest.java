package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Sweety25");
        loginPage.enterPassword("Sweety@25");
        loginPage.clickOnLoginButton();
        String expectedText = "Accounts Overview";
        String actualText =loginPage.getWelcomeText();
        Assert.assertEquals("SignIn Successfully", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.enterUserName("abvdsydga");
        loginPage.enterPassword("dsadadad@25");
        loginPage.clickOnLoginButton();
        String expectedText = "The username and password could not be verified.";
        String actualText =loginPage.getErrorMessage();
        Assert.assertEquals("Invalid Username & Password", expectedText, actualText);
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterUserName("Sweety25");
        loginPage.enterPassword("Sweety@25");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutButton();
        String expectedText="Customer Login";
        String actualText=loginPage.getLogoutText();
        Assert.assertEquals("Logout Successfully",expectedText,actualText);
    }
}
