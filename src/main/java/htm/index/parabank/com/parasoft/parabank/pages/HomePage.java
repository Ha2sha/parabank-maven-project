package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink=By.linkText("Register");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}
