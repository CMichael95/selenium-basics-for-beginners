package eu.michaelclement.util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WaitHelper {
    private final WebDriverWait wait;

    public WaitHelper(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofMillis(3000));
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public String getElementText(WebElement element) {
        wait.until(ExpectedConditions.and
                (
                        ExpectedConditions.visibilityOf(element),
                        d -> !"".equals(element.getText())
                ));
        return element.getText();
    }

    public void fillTextField(WebElement element, int text) {
        fillTextField(element, String.valueOf(text));
    }

    public void fillTextField(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void fillTextFieldAndEnter(WebElement element, int text) {
        fillTextFieldAndEnter(element, String.valueOf(text));
    }

    public void fillTextFieldAndEnter(WebElement element, String text) {
        fillTextField(element, text + Keys.ENTER);
    }

    public List<String> getElementsText(List<WebElement> elements) {
        try {
            wait.until(d -> !elements.isEmpty());
            List<String> textList = new ArrayList<>();
            for (WebElement element : elements) {
                textList.add(element.getText());
            }
            return textList;
        } catch (TimeoutException e) {
            return new ArrayList<>();
        }
    }

    public List<Integer> getIntegerElementsText(List<WebElement> elements) {
        try {
            wait.until(d -> !elements.isEmpty());
            List<Integer> textList = new ArrayList<>();
            for (WebElement element : elements) {
                textList.add(Integer.parseInt(element.getText().trim()));
            }
            return textList;
        } catch (TimeoutException e) {
            return new ArrayList<>();
        }
    }

    public int getElementsCount(List<WebElement> elements) {
        try {
            wait.until(d -> !elements.isEmpty());
            return elements.size();
        } catch (TimeoutException e) {
            return 0;
        }
    }

    public void chooseDropdownOptionByValue(List<WebElement> dropdownOptions, String value) {
        dropdownOptions.stream().filter(element -> value.equals(element.getText())).toList().get(0).click();
    }
}
