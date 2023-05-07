package automation.pages.RalucaPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CosDeCumparaturiPage {
    @FindBy(css = "p[class=\"woocommerce-mini-cart__empty-message empty title\"]")
    private WebElement cosDeCumparaturiText;

    @FindBy(xpath = "(//a[@href=\"#\"])[3]")
    private WebElement inchideCosDeCumparaturiSidebarButton;

    @FindBy(css = "a[class=\"btn btn-size-small btn-color-primary wc-backward\"]")
    private WebElement inapoiLaMagazinSidebarButton;

    public void checkCosDeCumparaturiMessageIsDisplayed() {
        Assert.assertTrue("The cos de cumparaturi message is not displayed", cosDeCumparaturiText.isDisplayed());}

    public void clickOnInchideButtonOnTheSidebar() {
        inchideCosDeCumparaturiSidebarButton.click();
    }

    public void clickOnInapoiLaMagazinButtonOnTheSidebar(){
        inapoiLaMagazinSidebarButton.click();
    }
}


