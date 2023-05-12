package automation.pages.Daniel.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class NoutatiPage {
    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement noutatiFeteTitleByCss;

    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    private WebElement noutatiFeteTitleByXpath;

    public void checkNoutatiFeteIsVisible(String numelecarevinedinfeature) {
        Assert.assertTrue("The title is visible on Noutati page ", noutatiFeteTitleByCss.isDisplayed());
        Assert.assertTrue("The title is not visible on Noutati page ", noutatiFeteTitleByXpath.getText().equals(numelecarevinedinfeature));
    }

    public void checkNoutatiFeteIsVisibleByCss(String pageName, String url) {
        Assert.assertTrue("The title of " + pageName + " is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));


    }
    public void checkNoutatiFeteIsVisibleByXpath(String daniel) {
        noutatiFeteTitleByXpath.getAttribute("class");

    }
}