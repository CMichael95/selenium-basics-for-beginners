package eu.michaelclement.pages.success;

import org.openqa.selenium.WebDriver;

public class SuccessPageController extends SuccessPageElements {

    public SuccessPageController(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        return waitHelper.getElementText(successMessageText);
    }
}
