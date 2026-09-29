package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TyposPage {
    private WebDriver driver;
    private By paragraphLocator = By.tagName("p");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getParagraphs() {
        return driver.findElements(paragraphLocator);
    }

    public String getFirstParagraphText() {
        return getParagraphs().get(0).getText();
    }
}