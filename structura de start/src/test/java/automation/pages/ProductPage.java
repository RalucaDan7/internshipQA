package automation.pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(css = "a[data-added-text=\"Navigați în lista de dorințe\"]")
    private WebElement heartButton;

    @FindBy(css = "a.added")
    private WebElement heartAddedButton;


    public void clickOnHeartButton() {
        heartButton.click();
    }

    public void checkHeartButton() {
        Assert.assertTrue("Heart button added is not visible ", heartAddedButton.isDisplayed());
    }
}

