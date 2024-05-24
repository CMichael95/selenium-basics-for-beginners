package eu.michaelclement.pages.summary;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class SummaryPageElements extends PageParent {
    @FindBy(xpath = "//td[@data-test-id='firstname']")
    protected WebElement firstnameText;
    @FindBy(xpath = "//td[@data-test-id='lastname']")
    protected WebElement lastnameText;
    @FindBy(xpath = "//td[@data-test-id='email']")
    protected WebElement emailText;
    @FindBy(xpath = "//td[@data-test-id='address-line1']")
    protected WebElement addressLine1Text;
    @FindBy(xpath = "//td[@data-test-id='address-line2']")
    protected WebElement addressLine2Text;
    @FindBy(xpath = "//td[@data-test-id='city']")
    protected WebElement cityText;
    @FindBy(xpath = "//td[@data-test-id='country']")
    protected WebElement countryText;
    @FindBy(xpath = "//td[@data-test-id='zip']")
    protected WebElement zipCodeText;
    @FindBy(xpath = "//td[@data-test-id='product-name']")
    protected List<WebElement> productNameTexts;
    @FindBy(xpath = "//td[@data-test-id='quantity']")
    protected List<WebElement> quantityTexts;
    @FindBy(xpath = "//td[@data-test-id='price']")
    protected List<WebElement> productSinglePriceTexts;
    @FindBy(xpath = "//td[@data-test-id='product-total-price']")
    protected List<WebElement> productTotalPriceTexts;
    @FindBy(xpath = "//td[@data-test-id='total-price']")
    protected WebElement totalPriceText;
    @FindBy(xpath = "//a[@data-test-id='back-to-checkout']")
    protected WebElement backToCheckoutButton;
    @FindBy(xpath = "//button[@data-test-id='order'")
    protected WebElement orderButton;

    public SummaryPageElements(WebDriver driver) {
        super(driver);
    }
}
