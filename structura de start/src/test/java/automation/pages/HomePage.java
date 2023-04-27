package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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

    @FindBy(xpath = "(//a[contains(@href,'contact')])")
    private WebElement messageLink;



    @FindBy(xpath = "(//span[contains(@class,'nav-link-text')])[6]")
    private WebElement accesoriiLinkMenu;


    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }


    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }


    public void mouseOverAccesoriiButton() throws InterruptedException {
        Actions action = new Actions(DriverUtil.getDriver());
        System.out.println("Ce e aici");
        action.moveToElement(accesoriiLinkMenu).perform();
        Thread.sleep(3000);
    }

    public void clickOnAccesoriiLink() {
        accesoriiLink.click();
    }

    public void clickOnContactLink() {
        messageLink.click();
    }

}

