package eu.michaelclement.pages;

import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageParent {
    protected final WaitHelper waitHelper;
    private final WebDriver driver;
    public PageParent(WebDriver driver) {
        this.driver = driver;
        this.waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
