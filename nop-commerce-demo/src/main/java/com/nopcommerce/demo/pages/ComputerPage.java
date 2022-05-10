package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    public ComputerPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText ;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
     WebElement desktopsLink;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement noteBookLink;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement softWareLink;

    public String getComputerText(){
        Reporter.log("Click on computer" + computerText.toString() + "<br>");
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopLink(){
        Reporter.log("Click on desktop" + desktopsLink.toString() + "<br>");
        clickOnElement(desktopsLink);
    }
    public void clickOnNoteBookLink(){
        Reporter.log("Click on note book" + noteBookLink.toString() + "<br>");
        clickOnElement(noteBookLink);
    }

    public void clickOnSoftWarepLink(){
        Reporter.log("Click on software" + desktopsLink.toString() + "<br>");
        clickOnElement(desktopsLink);
    }



}
