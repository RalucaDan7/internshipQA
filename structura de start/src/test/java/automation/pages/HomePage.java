package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;

    @FindBy(xpath = "(//div[contains(@class,'wd-cookies-inner')])")
    private WebElement messageLink;

    @FindBy(css = "div.wd-cookies-inner")
    private WebElement messageLinkCss;


    @FindBy(css = "li[id=\"menu-item-10614\"]")
    private WebElement accesoriiLinkMenu;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement subAccesoriiLinkMenu;


    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }


    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }


    public void mouseOverAccesoriiButton() throws InterruptedException {
        Actions action = new Actions(DriverUtil.getDriver());
        action.moveToElement(accesoriiLinkMenu).build().perform();
        action.moveToElement(subAccesoriiLinkMenu).perform();
        Thread.sleep(1000);

    }

    public void clickOnAccesoriiLink() {
        accesoriiLink.click();
    }

    public void clickOnTheContactButton() {
        messageLink.click();
    }
    public void clickOnTheContactButtonCss() {

        messageLinkCss.click();
    }

}

