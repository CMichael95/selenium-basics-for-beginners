package eu.michaelclement.pages.cart;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class CartPageElements extends PageParent {
    @FindBy(xpath = "//td[@data-test-id='cart-total-price']")
    protected WebElement cartTotalPriceText;
    @FindBy(xpath = "//button[@data-test-id='checkout']")
    protected WebElement checkoutButton;
    @FindBy(xpath = "//a[@data-test-id='back-to-products']")
    protected WebElement backToProductsButton;
    @FindBy(xpath = "//td[@data-test-id='table-product-name']")
    protected List<WebElement> productNameTexts;
    @FindBy(xpath = "//td[@data-test-id='table-quantity']/input")
    protected List<WebElement> productQuantityInputs;
    @FindBy(xpath = "//td[@data-test-id='table-price']")
    protected List<WebElement> productSinglePriceTexts;
    @FindBy(xpath = "//td[@data-test-id='table-total-price']")
    protected List<WebElement> productTotalPriceTexts;
    @FindBy(xpath = "//button[@class='minus-button']")
    protected List<WebElement> quantityMinusButtons;
    @FindBy(xpath = "//button[@class='plus-button']")
    protected List<WebElement> quantityPlusButtons;

    public CartPageElements(WebDriver driver) {
        super(driver);
    }
}
