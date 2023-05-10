package automation.pages.dianapages;

import automation.base.DriverUtil;
import org.junit.Assert;

public class BasePage {

    public void checkPageIsDisplayed(String pageName, String url) {
        Assert.assertTrue("The URL of " + pageName + " is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
    }
}
