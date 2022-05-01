package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By userName1 = By.name("username");
    By password1 = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");
    By errorMessage = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By logOutButton = By.linkText("Log Out");
    By logoutText = By.xpath("//h2[contains(text(),'Customer Login')]");

    public void enterUserName(String userName) {
        sendTextToElement(userName1, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(password1, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logOutButton);
    }
    public String getLogoutText(){
        return getTextFromElement(logoutText);

    }

}
