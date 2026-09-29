package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage {
    private WebDriver driver;
    private By inputLocator = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInput() {
        return driver.findElement(inputLocator);
    }

    public void sendKeys(String text) {
        getInput().clear();
        getInput().sendKeys(text);
    }

    public void sendArrowUp() {
        getInput().sendKeys(Keys.ARROW_UP);
    }

    public void sendArrowDown() {
        getInput().sendKeys(Keys.ARROW_DOWN);
    }

    public String getValue() {
        return getInput().getAttribute("value");
    }
}