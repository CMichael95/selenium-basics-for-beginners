package eu.michaelclement.pages.checkout;

import org.openqa.selenium.WebDriver;

public class CheckoutPageController extends CheckoutPageElements {
    public CheckoutPageController(WebDriver driver) {
        super(driver);
    }

    public void fillZipCode(String zipCode) {
        waitHelper.fillTextField(zipInput, zipCode);
    }

    public void chooseCountry(String country) {
        waitHelper.clickElement(countryDropdown);
        waitHelper.chooseDropdownOptionByValue(countryDropdownOptions, country);
    }

    public void fillCity(String city) {
        waitHelper.fillTextField(cityInput, city);
    }

    public void fillAddressLine2(String addressLine2) {
        if (addressLine2 != null) {
            waitHelper.fillTextField(addressLine2Input, addressLine2);
        }
    }

    public void fillAddressLine1(String addressLine1) {
        waitHelper.fillTextField(addressLine1Input, addressLine1);
    }

    public void fillEmail(String email) {
        waitHelper.fillTextField(emailInput, email);
    }

    public void fillLastname(String lastName) {
        waitHelper.fillTextField(lastnameInput, lastName);
    }

    public void fillFirstname(String firstName) {
        waitHelper.fillTextField(firstnameInput, firstName);
    }
}
