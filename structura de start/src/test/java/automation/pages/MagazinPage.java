package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MagazinPage {
    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement magazinText;

    public void checkMagazinTextIsDisplayed() {
        Assert.assertTrue("The magazin text is not displayed", magazinText.isDisplayed());
    }

    public void checkMagazinUrlIsDisplayed(String url) {
        Assert.assertTrue("The magazin url is not displayed", magazinText.isDisplayed());
    }
}
