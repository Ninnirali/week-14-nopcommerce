package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    public RegisterPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement  registerText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleFemaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfDay;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement dateofMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfYear;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement verifyFirstNameError;

    @FindBy(id = "LastName-error")
    WebElement verifyLastNameError;

    @FindBy(id = "Email-error")
    WebElement verifyEmailError;

    @FindBy(id = "Password-error")
    WebElement verifyPasswordError;

    @FindBy(id = "ConfirmPassword-error")
    WebElement verifyConfPasswordError;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistrationMessage;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public String getRegisterText(){
        Reporter.log("Verify register text" + registerText.toString() + "<br>");
        return getTextFromElement(registerText);
    }
    public void clickOnGenderButton(){
        Reporter.log("Click gender button" + maleFemaleRadio.toString() + "<br>");
        clickOnElement(maleFemaleRadio);
    }
    public void selectLastName(String text){
        Reporter.log("Click on last name " +text + lastName.toString() + "<br>");
        sendTextToElement(lastName, text);
    }
    public void selectFirstName(String text){
        Reporter.log("Click on first name " + firstName.toString() + "<br>");
        sendTextToElement(firstName, text);
    }
    public void selectDateOfBirth(String date)
    {
        Reporter.log("select day" + dateOfDay.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateOfDay,date);
    }

    public void selectMonthOfBirth(String month)
    {
        Reporter.log("select month" + dateofMonth.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateofMonth,month);
    }
    public void selectYearOfBirth(String year)
    {
        Reporter.log("select day" + dateOfYear.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateOfYear,year);
    }

    public void sendEmailText(String text){
        Reporter.log("Send email " + text + email.toString() + "<br>");
        sendTextToElement(email, text);
    }
    public void sendPasswordText(String text){
        Reporter.log("send password " + text +password.toString() + "<br>");
        sendTextToElement(password, text);
    }
    public void sendConfirmText(String text){
        Reporter.log("Confirm password " +text+ confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, text);
    }
    public void clickOnRegisterButton(){
        Reporter.log("Click register " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
    }
    public String getFirstNameErrorText(){
        Reporter.log("Verify first name error text" + verifyFirstNameError.toString() + "<br>");
        return getTextFromElement(verifyFirstNameError);
    }
    public String getLastNameErrorText(){
        Reporter.log("Verify last name error text" + verifyLastNameError.toString() + "<br>");
        return getTextFromElement(verifyLastNameError);
    }
    public String getEmailErrorText(){
        Reporter.log("Verify email error text" + verifyEmailError.toString() + "<br>");
        return getTextFromElement(verifyEmailError);
    }
    public String getPasswordErrorText(){
        Reporter.log("Verify password error text" + verifyPasswordError.toString() + "<br>");
        return getTextFromElement(verifyPasswordError);
    }
    public String getPasswordConfErrorText(){
        Reporter.log("Verify confirm password error text" + verifyConfPasswordError.toString() + "<br>");
        return getTextFromElement(verifyConfPasswordError);
    }
    public String getRegistrationCompletedText(){
        Reporter.log("Verify registration completed text" + verifyRegistrationMessage.toString() + "<br>");
        return getTextFromElement(verifyRegistrationMessage);
    }





}
