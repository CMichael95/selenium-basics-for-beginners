package eu.michaelclement.pages.cart;

import org.openqa.selenium.WebDriver;

public class CartPageController extends CartPageElements {
    public CartPageController(WebDriver driver) {
        super(driver);
    }

    public int getNthProductQuantity(int index) {
        return Integer.parseInt(waitHelper.getElementText(productQuantityInputs.get(index)));
    }

    public String getNthProductName(int index) {
        return waitHelper.getElementText(productNameTexts.get(index));
    }

    public String getNthProductSinglePrice(int index) {
        return waitHelper.getElementText(productSinglePriceTexts.get(index));
    }

    public String getNthProductTotalPrice(int index) {
        return waitHelper.getElementText(productTotalPriceTexts.get(index));
    }

    public String getCartTotalPrice() {
        return waitHelper.getElementText(cartTotalPriceText);
    }

    public void setNthProductQuantity(int index, int quantity) {
        waitHelper.fillTextField(productQuantityInputs.get(index), quantity);
    }

    public void clickNthElementMinusQuantityButton(int index) {
        waitHelper.clickElement(quantityMinusButtons.get(index));
    }

    public void clickNthElementPlusQuantityButton(int index) {
        waitHelper.clickElement(quantityPlusButtons.get(index));
    }

    public void clickCheckoutButton() {
        waitHelper.clickElement(checkoutButton);
    }

    public void clickBackToProductsButton() {
        waitHelper.clickElement(backToProductsButton);
    }
}
