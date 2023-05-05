package automation.pages.adriana_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage {
    @FindBy(css = "h1[class='entry-title title']")
    private WebElement WishlistEntryTitle;

    @FindBy(css = "h3[class='wd-entities-title']")
    private WebElement SapcaBaseballLink;

    public void checkWishlistName(String name) {
        Assert.assertEquals("The name of the page is not correct ", name, WishlistEntryTitle.getText());
    }

    public void checkIfSapcaBaseballIsDisplayed(String nume) {
        Assert.assertEquals("The product Sapca de baseball is not displayed",nume, SapcaBaseballLink.getText());
    }
}

