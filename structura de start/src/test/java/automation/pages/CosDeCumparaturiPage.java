package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CosDeCumparaturiPage {
    @FindBy(css = "p[class=\"woocommerce-mini-cart__empty-message empty title\"]")
    private WebElement cosDeCumparaturiText;

    public void checkCosDeCumparaturiMessageIsDisplayed() {
        Assert.assertTrue("The cos de cumparaturi message is not displayed", cosDeCumparaturiText.isDisplayed());
    }

    @FindBy(xpath = "(//a[@href='#'])[3]")
    private WebElement inchideCosDeCumparaturiButton;

    public void clickOnInchideButton() {
        inchideCosDeCumparaturiButton.click();
    }
}


