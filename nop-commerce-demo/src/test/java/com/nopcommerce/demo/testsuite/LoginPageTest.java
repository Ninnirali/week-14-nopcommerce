package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @Test(groups = { "sanity", "smoke", "regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("AB01070@gmail.com");
        loginPage.enterPassword("123456789999");
        loginPage.clickOnLoginButton();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = loginPage.getLoginErrorText();
        Assert.assertEquals(actualText, expectedText, "Error occur");
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("AB01070@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();
        String expectedText = "My account";
        String actualText = homePage.getMyAccountText();
        Assert.assertEquals(actualText, expectedText, "Error occur");
    }
    @Test(groups = {"Regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("AB01070@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogOutLink();

    }



}

