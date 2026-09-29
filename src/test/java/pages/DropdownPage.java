package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownLocator = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public Select getDropdown() {
        return new Select(driver.findElement(dropdownLocator));
    }

    public List<String> getOptionsText() {
        return getDropdown().getOptions().stream()
                .map(option -> option.getText())
                .toList();
    }

    public void selectByIndex(int index) {
        getDropdown().selectByIndex(index);
    }

    public String getSelectedOptionText() {
        return getDropdown().getFirstSelectedOption().getText();
    }
}