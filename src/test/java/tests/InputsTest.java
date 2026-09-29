package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTest extends BaseTest {

    @Test
    public void testInputsWithArrows() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        InputsPage page = new InputsPage(driver);

        page.sendKeys("100");
        Assert.assertEquals(page.getValue(), "100", "Введено 100");

        page.sendArrowUp();
        Assert.assertEquals(page.getValue(), "101", "После стрелки вверх должно быть 101");

        page.sendArrowDown();
        Assert.assertEquals(page.getValue(), "100", "После стрелки вниз должно быть 100");
    }
}