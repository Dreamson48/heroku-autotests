package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        DropdownPage page = new DropdownPage(driver);

        List<String> options = page.getOptionsText();
        Assert.assertEquals(options.size(), 3, "Должно быть 3 опции");

        page.selectByIndex(1);
        Assert.assertEquals(page.getSelectedOptionText(), "Option 1", "Выбрана Option 1");

        page.selectByIndex(2);
        Assert.assertEquals(page.getSelectedOptionText(), "Option 2", "Выбрана Option 2");
    }
}