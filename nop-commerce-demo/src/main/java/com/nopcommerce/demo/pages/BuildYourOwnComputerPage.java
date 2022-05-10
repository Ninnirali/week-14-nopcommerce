package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement buildComputer;

    @FindBy(xpath = "//h2[@class='product-title']/a[contains(text(),'Build your own computer')]")
    WebElement buildComputerText;

    @FindBy(id = "product_attribute_1")
    WebElement processorDropDown;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddRadios320;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadios400;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadio60;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadio50;

    @FindBy(id = "product_attribute_5_12")
    WebElement totalSoftwareCheck;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement acrobatSoftwareCheck10;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement acrobatSoftwareCheck50;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement acrobatSoftwareCheck5;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @FindBy(xpath = "//p[@class='content']")
    By verifyTopBar;


    public void clickOnBuildCop() {
        Reporter.log("click on ram " + buildComputer.toString() + "<br>");
        clickOnElement(buildComputer);
    }

    public String getBuildYourComputer() {
        Reporter.log("Verify build your own computer" + buildComputerText.toString() + buildComputerText);
        return getTextFromElement(buildComputerText);
    }

    public void ramDropDown(String ram) {
        Reporter.log("click on ram " + ramDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void processorDropDown(String processor) {
        Reporter.log("click on processor" + processorDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void osRadioButton(String os) {
        if (os == "Vista Home [+$50.00]") {
            Reporter.log("click on processor" + osRadio50.toString() + "<br>");
            clickOnElement(osRadio50);
        } else if (os == "Vista Premium [+$60.00]") {
            clickOnElement(osRadio60);
        }

    }

    public void clickHddRadio(String hdd) {
        Reporter.log("click on hdd radio button" + hddRadios320.toString() + "<br>");
        if (hdd == "320 GB") {
            clickOnElement(hddRadios320);
        } else if (hdd == "400 GB [+$100.00]") {
            clickOnElement(hddRadios400);
        }
    }

    public void acrobatSoftWareBox(String software) {
        if (software == "Microsoft Office [+$50.00]") {
            Reporter.log("click on soft ware box" + acrobatSoftwareCheck50.toString() + "<br>");
            clickOnElement(acrobatSoftwareCheck50);
        } else if (software == "Acrobat Reader [+$10.00]") {
            clickOnElement(acrobatSoftwareCheck10);
        } else if (software == "Total Commander [+$5.00]") {
            clickOnElement(acrobatSoftwareCheck5);
        }
    }

    public void totalSoftWareBox() {
        Reporter.log("click on soft ware box" + totalSoftwareCheck.toString() + "<br>");
        clickOnElement(totalSoftwareCheck);
    }

    public void addToCard() {
        Reporter.log("click on add to card" + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
    }

    public String getAddToCartBarMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(By.xpath("//p[@class=\"content\"]"));

    }


}
