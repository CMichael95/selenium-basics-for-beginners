package eu.michaelclement.pages.products;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class ProductsPageElements extends PageParent {
    @FindBy(xpath = "//input[@id='product-search']")
    protected WebElement searchInput;
    @FindBy(xpath = "//input[@id='min-price']")
    protected WebElement minimumPriceFilterField;
    @FindBy(xpath = "//input[@id='max-price']")
    protected WebElement maximumPriceFilterField;
    @FindBy(xpath = "//select[@id='sort-by']")
    protected WebElement sortDropdown;
    @FindBy(xpath = "//option[@value='name']")
    protected WebElement sortDropdownOptionName;
    @FindBy(xpath = "//option[[@value='price']")
    protected WebElement sortDropdownOptionPrice;
    @FindBy(xpath = "//div[@class='product-card']")
    protected List<WebElement> productCards;
    @FindBy(xpath = "//div[@class='product-card']/h3")
    protected List<WebElement> productTitleTexts;
    @FindBy(xpath = "//div[@class='product-card']/p[1]")
    protected List<WebElement> productTitleDescriptionsTexts;
    @FindBy(xpath = "//div[@class='product-card']/p[2]")
    protected List<WebElement> productTitlePricesTexts;

    public ProductsPageElements(WebDriver driver) {
        super(driver);
    }
}
