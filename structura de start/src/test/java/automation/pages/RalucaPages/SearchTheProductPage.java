package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchTheProductPage {
    @FindBy(css = "h1[class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;

    @FindBy(xpath = "(//input[@placeholder='Cauta produse'])[1]")
    private WebElement searchBoxField;


    public String takeTheTitleAndReturnTheValue() {
        return productTitle.getText();
    }

    public void typeTheValueInSearchBox(String value) {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), searchBoxField);
        searchBoxField.click();
        searchBoxField.sendKeys(value);
        searchBoxField.sendKeys(Keys.ENTER);
    }

    public void checkTheProductIsDisplayed(String value) {
       Assert.assertTrue("The product is not displayed", productTitle.getText().contains(value));
    }
}
