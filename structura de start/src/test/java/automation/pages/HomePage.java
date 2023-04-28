package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(css = "a[title=\"Cos de cumparaturi\"]")
    private WebElement cosDeCumparaturiLink;

    @FindBy(css = "div[class=\"cart-widget-side wd-side-hidden wd-right\"]")
    private WebElement cosDeCumparaturiSidebarInchis;

    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnCosDeCumparaturi() {
        cosDeCumparaturiLink.click();
    }



    public void checkTheSidebarIsNotDisplayed() {
        Assert.assertTrue("The cos de cumparaturi sidebar is displayed and it should not be",
                cosDeCumparaturiSidebarInchis.getAttribute("class") == null);
//        Daca nu gaseste niciun atribut cu valoarea wd-opened returneaza null si atunci inseamna ca sidebar-ul e inchis
    }
}
