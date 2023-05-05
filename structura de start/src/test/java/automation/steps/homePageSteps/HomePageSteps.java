package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

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
        homePage.clickOnDropdownItem();
    }

    @When("Click on Trimite-ne mesaj button")
    public void clickOnContactButton() {
        homePage.clickOnTheContactButton();
    }

    @When("Click on Trimite-ne mesaj button  using CSS")
    public void clickOnContactButtonCss() {
        homePage.clickOnTheContactButtonCss();
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
        WaitUtils.waitForPageToLoad();
        homePage.acceptCookies();
    }
}