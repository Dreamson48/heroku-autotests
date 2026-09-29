package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void testAddAndRemoveElement() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);

        page.clickAddElement();
        page.clickAddElement();
        Assert.assertEquals(page.getDeleteButtonsCount(), 2, "Должно быть 2 кнопки Delete");

        page.clickDeleteElement();
        Assert.assertEquals(page.getDeleteButtonsCount(), 1, "Должна остаться 1 кнопка Delete");
    }
}