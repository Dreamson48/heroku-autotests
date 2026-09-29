package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends BaseTest {

    @Test
    public void testTyposParagraph() {
        driver.get("https://the-internet.herokuapp.com/typos");
        TyposPage page = new TyposPage(driver);

        String text = page.getFirstParagraphText();
        Assert.assertNotNull(text, "Текст параграфа не должен быть пустым");
        Assert.assertTrue(text.contains("This page contains"), "Текст должен содержать начало фразы");
    }
}