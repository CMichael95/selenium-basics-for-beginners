package eu.michaelclement.pages.products;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductsPageController extends ProductsPageElements {
    public ProductsPageController(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String input) {
        waitHelper.fillTextFieldAndEnter(searchInput, input);
    }

    public void fillMinPriceFilterField(int price) {
        waitHelper.fillTextFieldAndEnter(minimumPriceFilterField, price);
    }

    public void fillMaxPriceFilterField(int price) {
        waitHelper.fillTextFieldAndEnter(maximumPriceFilterField, price);
    }

    public void selectSortDropdownOption(SortOption option) {
        this.sortDropdown.click();
        switch (option) {
            case NAME -> waitHelper.clickElement(sortDropdownOptionName);
            case PRICE -> waitHelper.clickElement(sortDropdownOptionPrice);
            default -> throw new RuntimeException();
        }

    }

    public int getProductCount() {
        return waitHelper.getElementsCount(productCards);
    }

    public List<String> getProductTitleTexts() {
        return waitHelper.getElementsText(productTitleTexts);
    }
}


