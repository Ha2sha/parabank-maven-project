package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();
        String expectedText = "Signing up is easy!";
        String actualText=registerPage.getWelcomeText();
        Assert.assertEquals("Register link not working", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("Sweety");
        registerPage.enterLastName("Popat");
        registerPage.enterStreet("101 E. Huntington Drive");
        registerPage.enterCity("California");
        registerPage.enterState("USA");
        registerPage.enterZipCode("91016");
        registerPage.enterPhoneNumber("91256897450");
        registerPage.enterSsn("123456");
        registerPage.enterUserName("Sweety25");
        registerPage.enterPassword("Sweety@25");
        registerPage.enterConfirmPassword("Sweety@25");
        registerPage.clickOnRegisterButton();
        String expectedMsg="Your account was created successfully. You are now logged in.";
        String actualMsg=registerPage.getRegistrationText();
        Assert.assertEquals("Registered Successfully.",expectedMsg,actualMsg);

    }
}
