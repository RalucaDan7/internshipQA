package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class NoutatiPage {
    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement noutatiFeteTitle;

    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement noutatiFeteTitle;

    public void checkNoutatiFeteIsVisible(String numelecarevinedinfeature) {
        Assert.assertTrue("The title is visible on Noutati page ", noutatiFeteTitle.isDisplayed());
        Assert.assertTrue("The title is visible on Noutati page ", noutatiFeteTitle.getText().equals(numelecarevinedinfeature));
    }
}
