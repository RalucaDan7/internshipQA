package automation.pages.Daniel.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RezultateRochiePage {
    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement cautareRezultatePentruRochie;

    public void checkCautareRezultatePentruRochieIsVisible() {
        Assert.assertTrue("The title is visible on Rezultate rochie page ", cautareRezultatePentruRochie.isDisplayed());
    }
}
