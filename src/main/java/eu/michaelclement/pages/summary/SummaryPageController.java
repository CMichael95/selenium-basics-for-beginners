package eu.michaelclement.pages.summary;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class SummaryPageController extends SummaryPageElements {
    public SummaryPageController(WebDriver driver) {
        super(driver);
    }

    public List<Integer> getProductQuantities() {
        return waitHelper.getIntegerElementsText(quantityTexts);
    }

    public List<String> getProductTotalPrices() {
        return waitHelper.getElementsText(productTotalPriceTexts);
    }

    public List<String> getProductPrices() {
        return waitHelper.getElementsText(productSinglePriceTexts);
    }

    public List<String> getProductNames() {
        return waitHelper.getElementsText(productNameTexts);
    }

    public String getFirstname() {
        return waitHelper.getElementText(firstnameText);
    }

    public String getLastname() {
        return waitHelper.getElementText(lastnameText);
    }

    public String getAddressLine1() {
        return waitHelper.getElementText(addressLine1Text);
    }

    public String getAddressLine2() {
        return waitHelper.getElementText(addressLine2Text);
    }

    public String getCity() {
        return waitHelper.getElementText(cityText);
    }

    public String getZipCode() {
        return waitHelper.getElementText(zipCodeText);
    }

    public String getCountry() {
        return waitHelper.getElementText(countryText).toUpperCase();
    }

    public String getEmail() {
        return waitHelper.getElementText(emailText);
    }

    public int getProductCount() {
        return waitHelper.getElementsCount(productNameTexts);
    }
}
