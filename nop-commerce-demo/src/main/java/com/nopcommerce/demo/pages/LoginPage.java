package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailText;

    @FindBy(name = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public void enterEmailId(String email) {
        Reporter.log("Enter email" + emailText.toString() + "<br>");
        sendTextToElement(emailText, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login" + loginButton.toString() + "<br>");
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        Reporter.log("Verify welcome text" + welcomeText.toString() + "<br>");
        return getTextFromElement(welcomeText);
    }
    public String getLoginErrorText() {
        Reporter.log("Verify login error text" + errorMessage.toString() + "<br>");
        return getTextFromElement(errorMessage);
    }



}
