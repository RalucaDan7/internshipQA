package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseTest {

    public String searchString;
    @When("Check Favorites Link Is Visible")
    public void checkFavoritesLinkIsVisible() {
        homePage.checkFavoritesLinkIsVisible();
    }

    @When("Click On MyAccount Button")
    public void clickOnMyAccountButton() {
        homePage.clickOnMyAccountButton();
    }

    @And("Click On Lista mea de dorințe Button")
    public void clickOnListaMeaDeDorinteButton() {
        homePage.clickOnFavoriteButton();
    }


    @Then("Check {string} title from Home Page")
    public void checkTitleExploreazacategorii(String title){
        homePage.checkTitleExploreazacategorii(title);
    }

    @And("Click On FogotPassword Link")
    public void clickOnForgotPasswordLink(){homePage.clickOnForgotPasswordLink();}
    @When("Click on Cos de cumparaturi")
    public void clickOnCosDeCumparaturi() {
        homePage.clickOnCosDeCumparaturi();
    }

    @And("Check the sidebar is not displayed")
    public void checkTheSidebarIsNotDisplayed() {
        homePage.checkTheSidebarIsNotDisplayed();
    }
    @And("Click the  Accesorii button")
    public void clickOnAccesoriiButton() {
        homePage.clickOnAccesoriiLink();
    }


    @And("User mouse over the Accesorii dropdown")
    public void mouseOverAccesorii() {
        homePage.mouseOverAccesoriiButton();
    }

    @And("User clicks on Sepci si palarii item")
    public void clickOnDropDownItem() {
        homePage.clickOnAccesoriiDropdownItem();
    }

    @When("Click on Trimite-ne mesaj button")
    public void clickOnContactButtonFromHomepage() {
        homePage.clickOnTheContactButton();
    }
    @And("Click on Descopera Colectia from home page")
    public void clickOnDescoperaColectiabutton(){homePage.clickOnDescoperaColectiabutton();}

    @And("Click On News button from Home page")
    public void clickOnNewsButton(){homePage.clickOnNewsButton();}

    @When("Click on Trimite-ne mesaj button  using CSS")
    public void clickOnContactButtonCss() {
        homePage.clickOnTheContactButtonCss();
    }
    @When("Click on Noutati Button")
    public void clickOnNoutatiButton() {
        homePage.clickOnNoutatiLink();
    }

    @When("Click on Cauta produse box")
    public void clickOnCautaProduseBox() {
        homePage.clickOnCautaProduseBox();
    }

    @When("Type in rochie and click search")
    public void completeSearchInputAndClickSearch() {
        homePage.completeSearchInputAndClickSearch();


    }

    @When("Type in rochie")
    public void completeSearch() {
        homePage.completeSearchInput2();


    }

    @Then("A dropdown menu with the suggested results is displayed")
    public void checkSuggestionList() {
        homePage.checkSuggestionListIsVisible();

    }

    @When("The user clicks on Contul meu button")
    public void clickOnContulMeuButton() {
        homePage.clickOnContulMeuButton();
    }
    @And("Insert {string} In Search Box")
    public void insertKeywordInSearchBox(String pass) {

        homePage.insertKeywordInSearchBox(pass);
    }

    @And("Click Search")
    public void clickSearch() {

        homePage.clickSearch();
    }

    @And("Insert {string} In Search Box By CSS")
    public void insertKeywordInSearchBoxCSS(String pass) {

        homePage.insertKeywordInSearchBoxCSS(pass);
    }

    @And("Click Search By CSS")
    public void clickSearchCSS() {

        homePage.clickSearchCSS();
    }
    @When("Click on noutati link")
    public void clickOnNoutatiLink() {
        homePage.clickOnNoutatiLInk();

    }
    @And("Click on reduceri link")
    public void clickOnReduceriLink(){
        homePage.clickOnReduceriLink();

    }
    @And("Click on Cauta produse search box")
    public void clickOnCautaProduseSearchBox() {
        homePage.clickOnCautaProduseSearchBox();
    }
    @Then("Type in {string} and submit")
    public void completeSearchInputAndClickSearch(String bluze) {
        homePage.completeSearchInputAndClickSearch(bluze);
    }
    @Then("Check title {string} apare")
    public void checkTitleApare(String floricica) {
        homePage.checkTitleApare(floricica);
    }

    @Then("A suggestion box is displayed")
    public void checkSuggestionBoxIsDisplayed() {

        homePage.checkSugestionBoxIsDisplayed();
    }

    @Then("Suggestion has {string} in name")
    public void checkSearchSuggestionIsCorrect(String pass) {
        homePage.checkSearchSuggestionIsCorrect(pass);
    }

    @And("Click On Suggestion")
    public void clickSuggestion() {

        homePage.clickSuggestion();
    }

    @And("The user clicks on Baieti")
    public void clickBaietiCategory(){
        homePage.clickBaietiCategory();
    }

    @And("Accepts cookies")
    public void acceptCookies(){
        homePage.acceptCookies();
    }
}