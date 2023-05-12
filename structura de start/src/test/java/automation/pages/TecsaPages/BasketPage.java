package automation.pages.TecsaPages;

import automation.baseTest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage {

    @FindBy(xpath = "//a[contains(text(),\"Pulover din bumbac pentru copii - 152 (11-12 ani)\")]")
    private WebElement puloverDinBumbacPentruCopii152;

    public void checkProduct(String title){
        Assert.assertTrue("Pulover din bumbac pentru copii - 152 is not present in Basket", puloverDinBumbacPentruCopii152.isDisplayed());
        Assert.assertTrue("Pulover din bumbac pentru copii - 152 is not present in Basket", puloverDinBumbacPentruCopii152.getText().contains(title));
    }

}
