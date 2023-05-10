package automation.pages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "//*[@id=\"post-3228\"]/div/div/section[4]/div/div/div/div/div/div/div/h2")
    private WebElement exploreazaCategoriiTitle;

    @FindBy(css = "a[href=\"https://qa-training.co.in/contul-meu/lost-password/\"]")
    private WebElement forgotPasswordLink;
    @FindBy(xpath = "(//span[contains(text(),'Noutati')])[1]")
    private WebElement noutatiDianaLink;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement cautaProduseInputOne;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement cautaProduseInputTwo;

    @FindBy(xpath = "(//button[@class=\"searchsubmit\"])[1]")
    private WebElement searchButton;

    @FindBy(xpath = "(//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"])[1]")
    private WebElement dropDownMenu;

    @FindBy(xpath = "(//a[@title=\"Contul meu\"])[1]")
    private WebElement contulMeuButton;

    @FindBy(css = "a[href=\"/categorie/fete/\"]")
    private WebElement descoperaColectiaButton;

    @FindBy(xpath = "//ul[@id=\"menu-primary-girl-menu\"]/li/a/span[text()=\"Noutati\"]")
    private WebElement newsButton;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    private WebElement searchSubmitButton;

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
    private WebElement searchDiana;
    @FindBy(xpath = "(//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"])[1]")
    private WebElement dropDianaDownMenu;
    @FindBy(xpath= "//h1[@class=\"entry-title title\"]")
    private WebElement bluzeTitle;

    public HomePage() {
    }

    //    @FindBy (css= "nav>a[class=\"breadcrumb-link\"]:nth-child(1)")
    //    private WebElement primaPaginaLink;

    @FindBy(xpath = "//div[@class=\"cookies-buttons\"]")
    private WebElement acceptCookiesButton;

    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnMyAccountButton(){
        myAccountButton.click();
    }
    public void clickOnNoutatiLink() {
        noutatiLink.click();

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
        searchSubmitButton.click();
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
        searchSubmitButton.click();
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

    public void clickOnContulMeuButton() {
        contulMeuButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


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

    public void acceptCookies() {
        WaitUtils.waitForPageToLoad();
        acceptCookiesButton.click();
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

