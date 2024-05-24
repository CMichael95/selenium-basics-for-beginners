package eu.michaelclement.pages.checkout;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class CheckoutPageElements extends PageParent {
    @FindBy(xpath = "//input[@id='first-name']")
    protected WebElement firstnameInput;
    @FindBy(xpath = "//input[@id='last-name']")
    protected WebElement lastnameInput;
    @FindBy(xpath = "//input[@id='email']")
    protected WebElement emailInput;
    @FindBy(xpath = "//input[@id='address-line-1']")
    protected WebElement addressLine1Input;
    @FindBy(xpath = "//input[@id='address-line-2']")
    protected WebElement addressLine2Input;
    @FindBy(xpath = "//input[@id='city']")
    protected WebElement cityInput;
    @FindBy(xpath = "//input[@id='zip-code']")
    protected WebElement zipInput;
    @FindBy(xpath = "//select[@id='country']")
    protected WebElement countryDropdown;
    @FindBy(xpath = "//option[@data-test-id='country-option']")
    protected List<WebElement> countryDropdownOptions;
    @FindBy(xpath = "//button[@data-test-id='summary']")
    protected WebElement summaryButton;
    @FindBy(xpath = "//a[@data-test-id='back-to-cart']")
    protected WebElement backToCartButton;


    public CheckoutPageElements(WebDriver driver) {
        super(driver);
    }
}
