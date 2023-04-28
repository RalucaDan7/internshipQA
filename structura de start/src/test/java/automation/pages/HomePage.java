package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;

    @FindBy(xpath = "(//a[contains(@href,'contact')])")
    private WebElement messageLink;




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

}

