package eu.michaelclement.pages.login;

import eu.michaelclement.data.User;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    public LoginPageController(WebDriver driver) {
        super(driver);
    }

    private void fillUsernameField(String username) {
        waitHelper.fillTextField(usernameField, username);
    }

    private void fillPasswordField(String password) {
        waitHelper.fillTextField(passwordField, password);
    }

    public void clickLoginButton() {
        waitHelper.clickElement(loginButton);
    }

    public void login(User user) {
        fillUsernameField(user.getUsername());
        fillPasswordField(user.getPassword());
        clickLoginButton();
    }
}
