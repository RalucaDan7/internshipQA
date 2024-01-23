package automation.pages.Daniel.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RezultateRochiePage {
    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement cautareRezultatePentruRochie;

    public void checkCautareRezultatePentruRochieIsVisible() {
        Assert.assertTrue("The title is visible on Rezultate rochie page ", cautareRezultatePentruRochie.isDisplayed());
    }
    public void checkCautareRezultatePentruRochieTileIsDisplayed(String magarus){
        Assert.assertTrue("The title is not visible on Rezultate rochie page ",cautareRezultatePentruRochie.getText().equals(magarus));
    }

    public void checkSearchPageIsDisplayed(String url) {
        String URL = cautareRezultatePentruRochie.getAttribute(url);
        Assert.assertEquals(URL, "qa-training.co.in/?s=rochie&post_type=product" );
        Assert.assertTrue("The URL of the page is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
    }
}
