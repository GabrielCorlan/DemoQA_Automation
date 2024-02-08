package pages;

import org.openqa.selenium.WebElement;

public class BasePage {

    public void clickElement(WebElement element) {
        element.click();
    }

    public void inputText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
