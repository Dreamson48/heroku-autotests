package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {

    @Test
    public void testCheckboxes() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckboxesPage page = new CheckboxesPage(driver);

        Assert.assertFalse(page.isFirstCheckboxChecked(), "Первый чекбокс должен быть unchecked");
        page.checkFirstCheckbox();
        Assert.assertTrue(page.isFirstCheckboxChecked(), "Первый чекбокс должен стать checked");

        page.uncheckFirstCheckbox();
        Assert.assertFalse(page.isFirstCheckboxChecked(), "Первый чекбокс должен снова стать unchecked");

        Assert.assertTrue(page.isSecondCheckboxChecked(), "Второй чекбокс должен быть checked");
        page.uncheckSecondCheckbox();
        Assert.assertFalse(page.isSecondCheckboxChecked(), "Второй чекбокс должен стать unchecked");
    }
}