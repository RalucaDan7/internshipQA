package automation.pages;

import org.junit.Assert;
import automation.base.DriverUtil;

public class BasePage {

    public void checkPageIsDisplayed(String pageName, String url) {
        Assert.assertTrue("The URL of " + pageName + " is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
    }
}
