package eu.michaelclement.pages.login;

import eu.michaelclement.pages.PageParent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class LoginPageElements extends PageParent {
    @FindBy(xpath = "//input[@id='username']")
    protected WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    protected WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement loginButton;

    public LoginPageElements(WebDriver driver) {
        super(driver);
    }
}
