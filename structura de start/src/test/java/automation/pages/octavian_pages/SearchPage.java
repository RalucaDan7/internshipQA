package automation.pages.octavian_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    private WebElement pageTitle;

    @FindBy(css = "h1[class=\"entry-title title\"]")
    private WebElement pageTitleCSS;

    public void checkTitle(String pass){
        Assert.assertEquals("The page title is not correct",pass, pageTitle.getText());
    }

    public void checkTitleByCSS(String pass) {
        Assert.assertEquals("The page title is not correct",pass, pageTitleCSS.getText());
    }
}
