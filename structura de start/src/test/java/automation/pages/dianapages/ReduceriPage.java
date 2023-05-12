package automation.pages.dianapages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReduceriPage {
    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    WebElement reduceriTitle;
    public void checkReduceriFetePageIsDisplayed(String url1){
        Assert.assertTrue("The Title of  Reduceri Fete  is not correct", reduceriTitle.getText().equals(url1));
    }
}
