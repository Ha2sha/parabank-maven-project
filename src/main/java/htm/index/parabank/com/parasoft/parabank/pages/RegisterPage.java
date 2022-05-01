package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By welcomeText=By.xpath("//h1[@class='title']");
    By fname=By.id("customer.firstName");
    By lname=By.id("customer.lastName");
    By street1=By.id("customer.address.street");
    By city1=By.id("customer.address.city");
    By state1=By.id("customer.address.state");
    By zipcode1=By.id("customer.address.zipCode");
    By phone=By.id("customer.phoneNumber");
    By ssn1=By.id("customer.ssn");
    By userName1=By.id("customer.username");
    By password1=By.id("customer.password");
    By confirmPassword1=By.id("repeatedPassword");
    By registerButton=By.xpath("//input[@value='Register']");
    By registrationText=By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(fname,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lname,lastName);
    }
    public void enterStreet(String street){
        sendTextToElement(street1,street);
    }
    public void enterCity(String city){
        sendTextToElement(city1,city);
    }
    public void enterState(String state){
        sendTextToElement(state1,state);
    }
    public void enterZipCode(String zipcode){
        sendTextToElement(zipcode1,zipcode);
    }
    public void enterPhoneNumber(String phonenumber){
        sendTextToElement(phone,phonenumber);
    }
    public void enterSsn(String ssn){
        sendTextToElement(ssn1,ssn);
    }
    public void enterUserName(String username){
        sendTextToElement(userName1,username);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPassword1,confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegistrationText(){
        return getTextFromElement(registrationText);
    }

}
