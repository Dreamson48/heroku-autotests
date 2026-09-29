package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {
    private WebDriver driver;
    private By addButton = By.xpath("//button[text()='Add Element']");
    private By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement() {
        driver.findElement(addButton).click();
    }

    public void clickDeleteElement() {
        driver.findElements(deleteButton).get(0).click();
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButton).size();
    }
}