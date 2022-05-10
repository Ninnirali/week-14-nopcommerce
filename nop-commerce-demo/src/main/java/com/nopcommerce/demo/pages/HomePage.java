package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @FindBy(linkText = "Computers")
    WebElement computer;

    @FindBy(linkText = "Electronics")
    WebElement electronics;

    @FindBy(linkText = "Apparel")
    WebElement apparel ;

    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloads;

    @FindBy(linkText = "Books")
    WebElement books;

    @FindBy(xpath = "//a[contains(text(),'Jewelry')]")
    WebElement jewelry;

    @FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
    WebElement giftCards;

    @FindBy(xpath = "//div[@class='header-logo']")
    WebElement logo;

    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement accountlink;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;


    public void clickOnLoginLink(){
        Reporter.log("Click On Login" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        Reporter.log("Click on register" + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

    public void clickOnElectronics(){
        Reporter.log("Click on electronics" + electronics.toString() + "<br>") ;
        clickOnElement(electronics);
    }
    public void clickOnApparel(){
        Reporter.log("click on apparel" + apparel.toString() + "<br>");
        clickOnElement(apparel);
    }
    public void clickOnDigitalDownloads(){
        Reporter.log("click on digital downloads" + digitalDownloads.toString() + "<br>");
        clickOnElement(digitalDownloads);
    }
    public void clickOnBooks(){
        Reporter.log("click on books" + books.toString() + "<br>");
        clickOnElement(books);
    }
    public void clickOnCJewelry(){
        Reporter.log("click on jewelry" + jewelry.toString() + "<br>");
        clickOnElement(jewelry);
    }
    public void clickOnGiftCards(){
        Reporter.log("click on gift cards" + giftCards.toString() + "<br>");
        clickOnElement(giftCards);
    }
    public void clickOnComputers(){
        Reporter.log("click on computer" + computer.toString() + "<br>");
        clickOnElement(computer);
    }
    public String getMyAccountText(){
        Reporter.log("Verify my account text" + accountlink.toString() + "<br>");
        return getTextFromElement(accountlink);
    }
    public String getLogOutText(){
        Reporter.log("Verify my account text" + logOut.toString() + "<br>");
        return getTextFromElement(logOut);
    }
    public void clickOnLogOutLink(){
        Reporter.log("Click on login button" + logOut.toString() + "<br>");
        clickOnElement(logOut);
    }


}
