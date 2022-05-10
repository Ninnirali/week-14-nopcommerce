package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    public DesktopPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @FindBy(xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortBy;

    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement display;

    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;

    public String  getDesktopsText(){
        Reporter.log("Verify desktops text" + desktopsText.toString() + "<br>");
        return getTextFromElement(desktopsText);
    }
    public void  clickOnSortBy(){
        Reporter.log("click on sort by text" + sortBy.toString() + "<br>");
        clickOnElement(sortBy);
    }
    public void  clickOnProductList(){
        Reporter.log("click on product text" + productList.toString() + "<br>");
        clickOnElement(productList);
    }
    public void  clickDisplay(){
        Reporter.log("click on display" + display.toString() + "<br>");
        clickOnElement(display);
    }

}
