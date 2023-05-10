package automation.pages.adriana_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    @FindBy(xpath = "(//h1[@class='entry-title title'])")
    private WebElement ContactEntryTitle;

    @FindBy(css = "h1[class='entry-title title']")
    private WebElement ContactEntryTitleCss;


    public void checkContactTitle(String nume) {
        Assert.assertEquals("The title of the page is not correct ", nume, ContactEntryTitle.getText());
    }

    public void checkContactTitleDiana(String nume) {
        Assert.assertTrue("The title of the page is not correct ", ContactTitle.isDisplayed());
    }

    public void checkContactTitleCss(String name) {
        Assert.assertEquals("The title of the page is not correct ", name, ContactEntryTitleCss.getText());
    }


}



