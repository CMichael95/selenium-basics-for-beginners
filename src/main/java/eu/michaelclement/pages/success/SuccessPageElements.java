package eu.michaelclement.pages.success;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPageElements extends PageParent {
    @FindBy(xpath = "//h3")
    protected WebElement successMessageText;

    public SuccessPageElements(WebDriver driver) {
        super(driver);
    }
}
