package automation.pages;

import automation.base.DriverUtil;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(css = "a[title=\"Cos de cumparaturi\"]")
    private WebElement cosDeCumparaturiLink;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;

    @FindBy(xpath = "(//a[contains(@href,'/contact/')])")
    private WebElement messageLink;

    @FindBy(css = "a[href='/contact/']")
    private WebElement messageLinkCss;
    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement cautaProduseInput;


    @FindBy(css = "li[id=\"menu-item-10614\"]")
    private WebElement accesoriiLinkMenu;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement subAccesoriiLinkMenu;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[24]")
    private WebElement dropDownItem;

    @FindBy(css = "div[class=\"cart-widget-side wd-side-hidden wd-right\"]")
    private WebElement cosDeCumparaturiSidebarInchisElement;
    @FindBy(xpath = "(//span[@class=\"nav-link-text\"])[4]")
    private WebElement noutatiLink;
    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    private WebElement noutatiTitle;
    @FindBy(xpath = "(//span[@class=\"nav-link-text\"])[3]")
    private WebElement reduceriLink;
    @FindBy(xpath = "(//button[@class=\"searchsubmit\"])[1]")
    private WebElement searchButton;
    @FindBy(xpath = "(//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"])[1]")
    private WebElement dropDownMenu;
    @FindBy(xpath= "//h1[@class=\"entry-title title\"]")
    private WebElement bluzeTitle;

    public HomePage() {
    }

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
        Assert.assertEquals(cosDeCumparaturiSidebarInchisElement.getAttribute("class"), "cart-widget-side wd-side-hidden wd-right");
    }
    public void mouseOverAccesoriiButton() {
        Actions action = new Actions(DriverUtil.getDriver());
        action.moveToElement(accesoriiLinkMenu).build().perform();
        action.moveToElement(subAccesoriiLinkMenu).perform();


    }

    public void clickOnAccesoriiLink() {
        accesoriiLink.click();
    }


    public void clickOnDropdownItem() {
        dropDownItem.click();
    }

    public void clickOnTheContactButton() {
        messageLink.click();
    }

    public void clickOnTheContactButtonCss() {
        messageLinkCss.click();

    }

    public void clickOnNoutatiLInk() {
        noutatiLink.click();
    }
    public void clickOnReduceriLink() {
        reduceriLink.click();
    }
    public void clickOnCautaProduseSearchBox() {
        cautaProduseInput.click();
    }
        public void completeSearchInputAndClickSearch(String bluze) {
        cautaProduseInput.sendKeys(bluze);
        searchButton.click();

        }
    public void checkTitleApare(String floare) {
        Assert.assertEquals("O disparut bluzele",floare, bluzeTitle.getText());
    }

    }


