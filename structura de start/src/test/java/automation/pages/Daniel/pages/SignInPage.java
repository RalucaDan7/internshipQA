package automation.pages.Daniel.pages;

import automation.base.DriverUtil;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SignInPage  {
    @FindBy(css = "div[class=\"login-form-side wd-side-hidden wd-right wd-opened\"]")
    private WebElement autentificareSideMenu;

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement eMailAddress;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@name=\"login\"]")
    private WebElement logareButton;


    @FindBy(xpath = "(//a[@title=\"Contul meu\"])[1]")
    private WebElement contulMeuButton;

    @FindBy(css = "div.wd-dropdown-menu.wd-dropdown-my-account")
    private WebElement subMenuContulMeuElement;


    public void seeAutentificareSideMenu() {
        autentificareSideMenu.isDisplayed();
    }

    public void inputEmailAddress(String username) {
        eMailAddress.sendKeys(username);
    }

    public void inputPassword(String parola) {
        passwordInput.sendKeys(parola);
    }

    public void clickOnLogareButton() {
        logareButton.click();
    }

    public void verifySubMenuContulMeuIsDisplayed(){
        Actions action = new Actions(DriverUtil.getDriver());
        action.moveToElement(contulMeuButton).perform();
        Assert.assertTrue("The Contul meu sub menu is not visible ", subMenuContulMeuElement.isDisplayed());
    }
}
