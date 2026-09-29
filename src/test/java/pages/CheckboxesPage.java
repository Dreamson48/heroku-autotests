package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkboxes = By.cssSelector("[type=checkbox]");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCheckboxes() {
        return driver.findElements(checkboxes);
    }

    public boolean isFirstCheckboxChecked() {
        return getCheckboxes().get(0).isSelected();
    }

    public void checkFirstCheckbox() {
        if (!isFirstCheckboxChecked()) {
            getCheckboxes().get(0).click();
        }
    }

    public void uncheckFirstCheckbox() {
        if (isFirstCheckboxChecked()) {
            getCheckboxes().get(0).click();
        }
    }

    public boolean isSecondCheckboxChecked() {
        return getCheckboxes().get(1).isSelected();
    }

    public void uncheckSecondCheckbox() {
        if (isSecondCheckboxChecked()) {
            getCheckboxes().get(1).click();
        }
    }
}