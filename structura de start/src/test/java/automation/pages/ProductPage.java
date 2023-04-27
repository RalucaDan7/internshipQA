package automation.pages;

import automation.steps.homePageSteps.HomePageSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//h1[@class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;


    public void checkProperProductPageIsDisplayed(String pass) {
        Assert.assertTrue("The product page title does not contain the search string", productTitle.getText().toLowerCase().contains(pass.toLowerCase()));
    }


}
