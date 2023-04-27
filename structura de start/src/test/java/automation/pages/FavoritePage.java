package automation.pages;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritePage {
    @FindBy(xpath = "(//h1[@class=\"entry-title title\"])[1]")
    private WebElement favoriteTitle;

    @FindBy(css = "a[property=\"v:title\"]")
    private WebElement acasaButton;

    public void checkTitleListadeDorinte() {
        Assert.assertTrue("Title Lista de Dorinte is not displayed", favoriteTitle.isDisplayed());
    }

    public void clickOnAcasabutton(){
        acasaButton.click();
    }
}
