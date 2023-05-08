package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "(//span[contains(text(),'Noutati')])[1]")
    private WebElement noutatiLink;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement cautaProduseInputOne;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement cautaProduseInputTwo;

    @FindBy(xpath = "(//button[@class=\"searchsubmit\"])[1]")
    private WebElement searchButton;

    @FindBy(xpath = "(//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"])[1]")
    private WebElement dropDownMenu;

    @FindBy(xpath = "(//span[@class=\"wd-tools-icon\"])[1]")
    private WebElement contulMeuButton;

    @FindBy(css = "div[class=\"login-form-side wd-side-hidden wd-right wd-opened\"]")
    private WebElement autentificareSideMenu;

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement eMailAddress;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@name=\"login\"]")
    private WebElement logareButton;

    @FindBy(xpath = "//ul[@class=\"wd-sub-menu\"]")
    private WebElement subMenu;

    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnNoutatiLink() {
        noutatiLink.click();

    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnCautaProduseBox() {
        cautaProduseInputOne.click();
    }

    public void checkSuggestionListIsVisible() {
        Assert.assertTrue("The suggestion list is not visible on Home page ", dropDownMenu.isDisplayed());
    }

    public void completeSearchInputAndClickSearch() {
        cautaProduseInputTwo.click();
        cautaProduseInputTwo.sendKeys("rochie");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchButton.click();
    }

    public void completeSearchInput2() {
        cautaProduseInputTwo.sendKeys("rochie");
        dropDownMenu.isDisplayed();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void dropDownMenuIsVisible(String daniel) {
        dropDownMenu.getAttribute("class");


    }
    public void clickOnContulMeuButton(){
        contulMeuButton.click();
    }
    public void seeAutentificareSideMenu(){
        autentificareSideMenu.isDisplayed();
    }

    public void inputEmailAddress(String username){
        eMailAddress.sendKeys(username);
    }
    public void inputPassword(String parola){
    passwordInput.sendKeys(parola);
    }
    public void clickOnLogareButton(){
        logareButton.click();
    }

    public void checkIfSubMenuIsVisible(){
        subMenu.isDisplayed();
    }

}

