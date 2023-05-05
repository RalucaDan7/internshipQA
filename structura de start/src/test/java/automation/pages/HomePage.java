package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;
import automation.base.DriverUtil;
import org.openqa.selenium.interactions.Actions;
import org.aspectj.bridge.IMessage;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "//*[@id=\"post-3228\"]/div/div/section[4]/div/div/div/div/div/div/div/h2")
    private WebElement exploreazaCategoriiTitle;

    @FindBy(css = "a[href=\"https://qa-training.co.in/contul-meu/lost-password/\"]")
    private WebElement forgotPasswordLink;

    @FindBy(css = "a[href=\"/categorie/fete/\"]")
    private WebElement descoperaColectiaButton;

    @FindBy(xpath = "//ul[@id=\"menu-primary-girl-menu\"]/li/a/span[text()=\"Noutati\"]")
    private WebElement newsButton;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    private WebElement searchButton;

    @FindBy(css = "input[title=\"Cauta produse\"]:nth-of-type(1)")
    private WebElement searchBoxCSS;

    @FindBy(css = "button[class=\"searchsubmit\"]:nth-of-type(1)")
    private WebElement searchButtonCSS;

    @FindBy(xpath = "//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"]")
    private WebElement suggestionBox;

    @FindBy(xpath = "//h4[@class=\"wd-entities-title\"]")
    private WebElement suggestionsDropdown;

    @FindBy(xpath = "(//div[@class=\"wrapper-content-banner wd-fill wd-items-bottom wd-justify-center\"])[2]")
    private WebElement baietiCategoryButton;


    @FindBy(css = "a[title=\"Cos de cumparaturi\"]")
    private WebElement cosDeCumparaturiLink;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;

    @FindBy(xpath = "(//a[contains(@href,'/contact/')])")
    private WebElement messageLink;

    @FindBy(css = "a[href='/contact/']")
    private WebElement messageLinkCss;


    @FindBy(css = "li[id=\"menu-item-10614\"]")
    private WebElement accesoriiLinkMenu;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement subAccesoriiLinkMenu;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[24]")
    private WebElement dropDownItem;

    @FindBy(css = "div[class=\"cart-widget-side wd-side-hidden wd-right\"]")
    private WebElement cosDeCumparaturiSidebarInchisElement;

//    @FindBy (css= "nav>a[class=\"breadcrumb-link\"]:nth-child(1)")
//    private WebElement primaPaginaLink;

    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }


    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnFavoriteButton() {

        favoritesLink.click();
    }

    public void checkTitleExploreazacategorii(String title) {
        Assert.assertTrue("Exploreaza categorii title is not visible", exploreazaCategoriiTitle.isDisplayed());
        Assert.assertTrue("Exploreaza categorii title is not visible", exploreazaCategoriiTitle.getText().equals(title));
    }
    public void clickOnForgotPasswordLink(){
        forgotPasswordLink.click();
    }

    public void clickOnDescoperaColectiabutton(){descoperaColectiaButton.click();}

    public void clickOnCosDeCumparaturi() {
        cosDeCumparaturiLink.click();
    }
    public void insertKeywordInSearchBox(String pass) {
        searchBox.sendKeys(pass);
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void insertKeywordInSearchBoxCSS(String pass) {
        searchBoxCSS.sendKeys(pass);
    }

    public void clickSearchCSS(){
        searchButtonCSS.click();
    }

    public void checkSugestionBoxIsDisplayed() {
        Assert.assertTrue("suggestion box is not displayed", suggestionBox.isDisplayed());
    }

    public void checkSearchSuggestionIsCorrect(String pass) {
        Assert.assertTrue("Search suggestion doesn't show products related to \"" + pass + "\"", suggestionsDropdown.getText().toLowerCase().contains(pass.toLowerCase()));
    }

    public void clickSuggestion() {
        suggestionsDropdown.click();
    }

    public void clickBaietiCategory() {
        baietiCategoryButton.click();
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
    public void clickOnNewsButton(){newsButton.click();}



    public void clickOnAccesoriiDropdownItem() {
        dropDownItem.click();
    }

    public void clickOnTheContactButton() {
        messageLink.click();
    }

    public void clickOnTheContactButtonCss() {
        messageLinkCss.click();
    }

}

