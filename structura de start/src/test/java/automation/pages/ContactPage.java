package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    @FindBy(xpath = "(//h1[@class='entry-title title'])")
    private WebElement ContactTitle;

    @FindBy(css = "h1[class='entry-title title']")
    private WebElement ContactTitleCss;


    public void checkContactTitle(String nume) {
         // Assert.assertTrue("The title of the page is not correct ", ContactTitle.getText());
        Assert.assertTrue("The title of the page is not correct ", ContactTitle.isDisplayed());
    }

    public void checkContactTitleCss(String name) {
        Assert.assertEquals("The title of the page is not correct ", name, ContactTitleCss.getText());
    }


}



