package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;

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
    public void checkSuggestionIsCorrect(String pass) {
        homePage.checkSuggestionIsCorrect(pass);
    }

    @And("Click On Suggestion")
    public void clickSuggestion() {

        homePage.clickSuggestion();
    }

    @And("The user clicks on Baieti")
    public void clickBaietiCategory(){
        homePage.clickBaietiCategory();
    }
}